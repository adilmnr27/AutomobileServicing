package com.autoservice.bookingmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.autoservice.bookingmanagement.logic.api.Bookingmanagement;
import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.autoservice.bookingmanagement.logic.api.usecase.UcFindBooking;
import com.autoservice.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.autoservice.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of bookingmanagement
 */
@Named
public class BookingmanagementImpl extends AbstractComponentFacade implements Bookingmanagement {

	@Inject
	private UcFindBooking ucFindBooking;

	@Inject
	private UcManageBooking ucManageBooking;

	@Override
	public BookingEto findBooking(long id) {

		return this.ucFindBooking.findBooking(id);
	}

	@Override
	public Page<BookingEto> findBookings(BookingSearchCriteriaTo criteria) {
		return this.ucFindBooking.findBookings(criteria);
	}

	@Override
	public BookingEto saveBooking(BookingEto booking) {

		return this.ucManageBooking.saveBooking(booking);
	}

	@Override
	public boolean deleteBooking(long id) {

		return this.ucManageBooking.deleteBooking(id);
	}

	@Override
	public BookingEto getAvailableSlots(BookingSearchCriteriaTo criteria) {
		return null;

	}





}
