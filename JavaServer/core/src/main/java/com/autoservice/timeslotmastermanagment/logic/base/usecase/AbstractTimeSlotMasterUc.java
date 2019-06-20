package com.autoservice.timeslotmastermanagment.logic.base.usecase;

import javax.inject.Inject;

import com.autoservice.general.logic.base.AbstractUc;
import com.autoservice.timeslotmastermanagment.dataaccess.api.repo.TimeSlotMasterRepository;

/**
 * Abstract use case for TimeSlotMasters, which provides access to the commonly
 * necessary data access objects.
 */
public class AbstractTimeSlotMasterUc extends AbstractUc {

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
