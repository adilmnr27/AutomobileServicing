package com.autoservice.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.autoservice.bookingmanagement.dataaccess.api.repo.BookingRepository;
import com.autoservice.general.logic.base.AbstractUc;

/**
 * Abstract use case for Bookings, which provides access to the commonly
 * necessary data access objects.
 */
public class AbstractBookingUc extends AbstractUc {

	/** @see #getBookingRepository() */
	@Inject
	private BookingRepository bookingRepository;

	/**
	 * Returns the field 'bookingRepository'.
	 * 
	 * @return the {@link BookingRepository} instance.
	 */
	public BookingRepository getBookingRepository() {

		return this.bookingRepository;
	}

}
