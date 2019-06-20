package com.autoservice.timeslotmastermanagment.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.autoservice.timeslotmastermanagment.dataaccess.api.TimeSlotMasterEntity;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;
import com.autoservice.timeslotmastermanagment.logic.api.usecase.UcFindTimeSlotMaster;
import com.autoservice.timeslotmastermanagment.logic.base.usecase.AbstractTimeSlotMasterUc;

/**
 * Use case implementation for searching, filtering and getting TimeSlotMasters
 */
@Named
@Validated
@Transactional
public class UcFindTimeSlotMasterImpl extends AbstractTimeSlotMasterUc implements UcFindTimeSlotMaster {

	/**
	 * Logger instance.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(UcFindTimeSlotMasterImpl.class);

	@Override
	public TimeSlotMasterEto findTimeSlotMaster(long id) {
		LOG.debug("Get TimeSlotMaster with id {} from database.", id);
		Optional<TimeSlotMasterEntity> foundEntity = getTimeSlotMasterRepository().findById(id);
		if (foundEntity.isPresent())
			return getBeanMapper().map(foundEntity.get(), TimeSlotMasterEto.class);
		else
			return null;
	}

	@Override
	public Page<TimeSlotMasterEto> findTimeSlotMasters(TimeSlotMasterSearchCriteriaTo criteria) {
		Page<TimeSlotMasterEntity> timeslotmasters = getTimeSlotMasterRepository().findByCriteria(criteria);
		return mapPaginatedEntityList(timeslotmasters, TimeSlotMasterEto.class);
	}

}
