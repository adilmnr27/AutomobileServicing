package com.autoservice.timeslotmastermanagment.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.autoservice.timeslotmastermanagment.logic.api.Timeslotmastermanagment;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;
import com.autoservice.timeslotmastermanagment.service.api.rest.TimeslotmastermanagmentRestService;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Timeslotmastermanagment}.
 */
@Named("TimeslotmastermanagmentRestService")
public class TimeslotmastermanagmentRestServiceImpl implements TimeslotmastermanagmentRestService {

	@Inject
	private Timeslotmastermanagment timeslotmastermanagment;

	@Override
	public TimeSlotMasterEto getTimeSlotMaster(long id) {
		return this.timeslotmastermanagment.findTimeSlotMaster(id);
	}

	@Override
	public TimeSlotMasterEto saveTimeSlotMaster(TimeSlotMasterEto timeslotmaster) {
		return this.timeslotmastermanagment.saveTimeSlotMaster(timeslotmaster);
	}

	@Override
	public void deleteTimeSlotMaster(long id) {
		this.timeslotmastermanagment.deleteTimeSlotMaster(id);
	}

	@Override
	public Page<TimeSlotMasterEto> findTimeSlotMasters(TimeSlotMasterSearchCriteriaTo searchCriteriaTo) {
		return this.timeslotmastermanagment.findTimeSlotMasters(searchCriteriaTo);
	}

}
