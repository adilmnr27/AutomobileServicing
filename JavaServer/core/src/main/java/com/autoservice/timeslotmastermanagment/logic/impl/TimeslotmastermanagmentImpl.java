package com.autoservice.timeslotmastermanagment.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.autoservice.general.logic.base.AbstractComponentFacade;
import com.autoservice.timeslotmastermanagment.logic.api.Timeslotmastermanagment;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;
import com.autoservice.timeslotmastermanagment.logic.api.usecase.UcFindTimeSlotMaster;
import com.autoservice.timeslotmastermanagment.logic.api.usecase.UcManageTimeSlotMaster;

/**
 * Implementation of component interface of timeslotmastermanagment
 */
@Named
public class TimeslotmastermanagmentImpl extends AbstractComponentFacade implements Timeslotmastermanagment {

	@Inject
	private UcFindTimeSlotMaster ucFindTimeSlotMaster;

	@Inject
	private UcManageTimeSlotMaster ucManageTimeSlotMaster;

	@Override
	public TimeSlotMasterEto findTimeSlotMaster(long id) {

		return this.ucFindTimeSlotMaster.findTimeSlotMaster(id);
	}

	@Override
	public Page<TimeSlotMasterEto> findTimeSlotMasters(TimeSlotMasterSearchCriteriaTo criteria) {
		return this.ucFindTimeSlotMaster.findTimeSlotMasters(criteria);
	}

	@Override
	public TimeSlotMasterEto saveTimeSlotMaster(TimeSlotMasterEto timeslotmaster) {

		return this.ucManageTimeSlotMaster.saveTimeSlotMaster(timeslotmaster);
	}

	@Override
	public boolean deleteTimeSlotMaster(long id) {

		return this.ucManageTimeSlotMaster.deleteTimeSlotMaster(id);
	}

}
