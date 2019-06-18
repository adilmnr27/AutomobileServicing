package com.autoservice.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.autoservice.bookingmanagement.dataaccess.api.BookingEntity;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link BookingEntity}
 */
public interface BookingRepository extends DefaultRepository<BookingEntity> {

	/**
	 * @param criteria the {@link BookingSearchCriteriaTo} with the criteria to
	 *                 search.
	 * @return the {@link Page} of the {@link BookingEntity} objects that matched
	 *         the search. If no pageable is set, it will return a unique page with
	 *         all the objects that matched the search.
	 */
	default Page<BookingEntity> findByCriteria(BookingSearchCriteriaTo criteria) {

		BookingEntity alias = newDslAlias();
		JPAQuery<BookingEntity> query = newDslQuery(alias);

		String make = criteria.getMake();
		if (make != null && !make.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getMake()), make, criteria.getMakeOption());
		}
		String model = criteria.getModel();
		if (model != null && !model.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getModel()), model, criteria.getModelOption());
		}
		String fuel = criteria.getFuel();
		if (fuel != null && !fuel.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getFuel()), fuel, criteria.getFuelOption());
		}
		String customerName = criteria.getCustomerName();
		if (customerName != null && !customerName.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getCustomerName()), customerName,
					criteria.getCustomerNameOption());
		}
		String phoneNo = criteria.getPhoneNo();
		if (phoneNo != null && !phoneNo.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getPhoneNo()), phoneNo, criteria.getPhoneNoOption());
		}
		String dateOfBooking = criteria.getDateOfBooking();
		if (dateOfBooking != null && !dateOfBooking.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getDateOfBooking()), dateOfBooking,
					criteria.getDateOfBookingOption());
		}
		Integer slotId = criteria.getSlotId();
		if (slotId != null) {
			query.where($(alias.getSlotId()).eq(slotId));
		}
		if (criteria.getPageable() == null) {
			criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
		} else {
			addOrderBy(query, alias, criteria.getPageable().getSort());
		}

		return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
	}

	/**
	 * Add sorting to the given query on the given alias
	 * 
	 * @param query to add sorting to
	 * @param alias to retrieve columns from for sorting
	 * @param sort  specification of sorting
	 */
	public default void addOrderBy(JPAQuery<BookingEntity> query, BookingEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "make":
					if (next.isAscending()) {
						query.orderBy($(alias.getMake()).asc());
					} else {
						query.orderBy($(alias.getMake()).desc());
					}
					break;
				case "model":
					if (next.isAscending()) {
						query.orderBy($(alias.getModel()).asc());
					} else {
						query.orderBy($(alias.getModel()).desc());
					}
					break;
				case "fuel":
					if (next.isAscending()) {
						query.orderBy($(alias.getFuel()).asc());
					} else {
						query.orderBy($(alias.getFuel()).desc());
					}
					break;
				case "customerName":
					if (next.isAscending()) {
						query.orderBy($(alias.getCustomerName()).asc());
					} else {
						query.orderBy($(alias.getCustomerName()).desc());
					}
					break;
				case "phoneNo":
					if (next.isAscending()) {
						query.orderBy($(alias.getPhoneNo()).asc());
					} else {
						query.orderBy($(alias.getPhoneNo()).desc());
					}
					break;
				case "dateOfBooking":
					if (next.isAscending()) {
						query.orderBy($(alias.getDateOfBooking()).asc());
					} else {
						query.orderBy($(alias.getDateOfBooking()).desc());
					}
					break;
				case "slotId":
					if (next.isAscending()) {
						query.orderBy($(alias.getSlotId()).asc());
					} else {
						query.orderBy($(alias.getSlotId()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

}