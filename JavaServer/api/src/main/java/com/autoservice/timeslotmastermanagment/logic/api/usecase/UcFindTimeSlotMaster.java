package com.autoservice.timeslotmastermanagment.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;

public interface UcFindTimeSlotMaster {

	/**
	 * Returns a TimeSlotMaster by its id 'id'.
	 *
	 * @param id The id 'id' of the TimeSlotMaster.
	 * @return The {@link TimeSlotMasterEto} with id 'id'
	 */
	TimeSlotMasterEto findTimeSlotMaster(long id);

	/**
	 * Returns a paginated list of TimeSlotMasters matching the search criteria.
	 *
	 * @param criteria the {@link TimeSlotMasterSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link TimeSlotMasterEto}s.
	 */
	Page<TimeSlotMasterEto> findTimeSlotMasters(TimeSlotMasterSearchCriteriaTo criteria);

}
