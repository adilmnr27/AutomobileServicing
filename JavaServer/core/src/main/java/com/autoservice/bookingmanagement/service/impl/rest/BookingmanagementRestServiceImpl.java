package com.autoservice.bookingmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.autoservice.bookingmanagement.logic.api.Bookingmanagement;
import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.autoservice.bookingmanagement.service.api.rest.BookingmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Bookingmanagement}.
 */
@Named("BookingmanagementRestService")
public class BookingmanagementRestServiceImpl implements BookingmanagementRestService {

	@Inject
	private Bookingmanagement bookingmanagement;

	@Override
	public BookingEto getBooking(long id) {
		return this.bookingmanagement.findBooking(id);
	}

	@Override
	public BookingEto saveBooking(BookingEto booking) {
		return this.bookingmanagement.saveBooking(booking);
	}

	@Override
	public void deleteBooking(long id) {
		this.bookingmanagement.deleteBooking(id);
	}

	@Override
	public Page<BookingEto> findBookings(BookingSearchCriteriaTo searchCriteriaTo) {
		return this.bookingmanagement.findBookings(searchCriteriaTo);
	}

}
