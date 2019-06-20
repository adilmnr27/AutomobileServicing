package com.autoservice.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.autoservice.bookingmanagement.dataaccess.api.repo.BookingRepository;
import com.autoservice.general.logic.base.AbstractUc;
import com.autoservice.timeslotmastermanagment.dataaccess.api.repo.TimeSlotMasterRepository;

public class AbstractMultipurposeUc extends AbstractUc{

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


	/** @see #getTimeSlotMasterRepository() */
	@Inject
	private TimeSlotMasterRepository timeSlotMasterRepository;

	/**
	 * Returns the field 'timeSlotMasterRepository'.
	 *
	 * @return the {@link TimeSlotMasterRepository} instance.
	 */
	public TimeSlotMasterRepository getTimeSlotMasterRepository() {

		return this.timeSlotMasterRepository;
	}

}
