package com.autoservice.bookingmanagement.logic.impl.usecase;

import javax.inject.Named;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.autoservice.bookingmanagement.dataaccess.api.BookingEntity;
import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.autoservice.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.autoservice.bookingmanagement.logic.api.usecase.UcMultipurpose;
import com.autoservice.bookingmanagement.logic.base.usecase.AbstractBookingUc;
import com.autoservice.bookingmanagement.logic.base.usecase.AbstractMultipurposeUc;
import com.autoservice.timeslotmastermanagment.dataaccess.api.TimeSlotMasterEntity;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;

@Named
@Validated
@Transactional
public class UcMultipurposeImpl extends AbstractMultipurposeUc implements UcMultipurpose {

	@Override
	public Page<TimeSlotMasterEto> getAvailableSlots(BookingSearchCriteriaTo criteria) {
		// TODO Auto-generated method stub
		TimeSlotMasterSearchCriteriaTo criteria2 = null;
		Page<TimeSlotMasterEntity> timeslotmasters = getTimeSlotMasterRepository().findByCriteria(criteria2);
		Page<TimeSlotMasterEto> timeSlotMasterEtos = mapPaginatedEntityList(timeslotmasters, TimeSlotMasterEto.class);
		Page<BookingEntity> bookings = getBookingRepository().findByCriteria(criteria);
		Page<BookingEto> bookingEtos =  mapPaginatedEntityList(bookings, BookingEto.class);
		return null;
	}

}
