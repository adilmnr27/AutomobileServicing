package com.autoservice.timeslotmastermanagment.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.autoservice.timeslotmastermanagment.dataaccess.api.TimeSlotMasterEntity;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link TimeSlotMasterEntity}
 */
public interface TimeSlotMasterRepository extends DefaultRepository<TimeSlotMasterEntity> {

	/**
	 * @param criteria the {@link TimeSlotMasterSearchCriteriaTo} with the criteria
	 *                 to search.
	 * @return the {@link Page} of the {@link TimeSlotMasterEntity} objects that
	 *         matched the search. If no pageable is set, it will return a unique
	 *         page with all the objects that matched the search.
	 */
	default Page<TimeSlotMasterEntity> findByCriteria(TimeSlotMasterSearchCriteriaTo criteria) {

		TimeSlotMasterEntity alias = newDslAlias();
		JPAQuery<TimeSlotMasterEntity> query = newDslQuery(alias);

		String duration = criteria.getDuration();
		if (duration != null && !duration.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getDuration()), duration, criteria.getDurationOption());
		}
		String slotTime = criteria.getSlotTime();
		if (slotTime != null && !slotTime.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getSlotTime()), slotTime, criteria.getSlotTimeOption());
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
	public default void addOrderBy(JPAQuery<TimeSlotMasterEntity> query, TimeSlotMasterEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "duration":
					if (next.isAscending()) {
						query.orderBy($(alias.getDuration()).asc());
					} else {
						query.orderBy($(alias.getDuration()).desc());
					}
					break;
				case "slotTime":
					if (next.isAscending()) {
						query.orderBy($(alias.getSlotTime()).asc());
					} else {
						query.orderBy($(alias.getSlotTime()).desc());
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