package com.autoservice.timeslotmastermanagment.logic.api.usecase;

import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;

/**
 * Interface of UcManageTimeSlotMaster to centralize documentation and
 * signatures of methods.
 */
public interface UcManageTimeSlotMaster {

	/**
	 * Deletes a timeSlotMaster from the database by its id 'timeSlotMasterId'.
	 *
	 * @param timeSlotMasterId Id of the timeSlotMaster to delete
	 * @return boolean <code>true</code> if the timeSlotMaster can be deleted,
	 *         <code>false</code> otherwise
	 */
	boolean deleteTimeSlotMaster(long timeSlotMasterId);

	/**
	 * Saves a timeSlotMaster and store it in the database.
	 *
	 * @param timeSlotMaster the {@link TimeSlotMasterEto} to create.
	 * @return the new {@link TimeSlotMasterEto} that has been saved with ID and
	 *         version.
	 */
	TimeSlotMasterEto saveTimeSlotMaster(TimeSlotMasterEto timeSlotMaster);

}
