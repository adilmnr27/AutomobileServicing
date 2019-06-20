package com.autoservice.timeslotmastermanagment.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.autoservice.timeslotmastermanagment.dataaccess.api.TimeSlotMasterEntity;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.usecase.UcManageTimeSlotMaster;
import com.autoservice.timeslotmastermanagment.logic.base.usecase.AbstractTimeSlotMasterUc;

/**
 * Use case implementation for modifying and deleting TimeSlotMasters
 */
@Named
@Validated
@Transactional
public class UcManageTimeSlotMasterImpl extends AbstractTimeSlotMasterUc implements UcManageTimeSlotMaster {

	/**
	 * Logger instance.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(UcManageTimeSlotMasterImpl.class);

	@Override
	public boolean deleteTimeSlotMaster(long timeSlotMasterId) {

		TimeSlotMasterEntity timeSlotMaster = getTimeSlotMasterRepository().find(timeSlotMasterId);
		getTimeSlotMasterRepository().delete(timeSlotMaster);
		LOG.debug("The timeSlotMaster with id '{}' has been deleted.", timeSlotMasterId);
		return true;
	}

	@Override
	public TimeSlotMasterEto saveTimeSlotMaster(TimeSlotMasterEto timeSlotMaster) {

		Objects.requireNonNull(timeSlotMaster, "timeSlotMaster");

		TimeSlotMasterEntity timeSlotMasterEntity = getBeanMapper().map(timeSlotMaster, TimeSlotMasterEntity.class);

		// initialize, validate timeSlotMasterEntity here if necessary
		TimeSlotMasterEntity resultEntity = getTimeSlotMasterRepository().save(timeSlotMasterEntity);
		LOG.debug("TimeSlotMaster with id '{}' has been created.", resultEntity.getId());
		return getBeanMapper().map(resultEntity, TimeSlotMasterEto.class);
	}

}
