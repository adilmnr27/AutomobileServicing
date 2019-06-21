package com.autoservice.bookingmanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
//		Page<TimeSlotMasterEntity> timeslotmasters = getTimeSlotMasterRepository().findByCriteria(criteria2);

		// getting all the time slots from the master list
		List<TimeSlotMasterEntity> timeSlotMasterEntityList = getTimeSlotMasterRepository().findAll();

		timeSlotMasterEntityList.get(0);

		// Finding the list of bookings where the date matches
		Page<BookingEntity> bookings = getBookingRepository().findByCriteria(criteria);
		Page<BookingEto> bookingEtos = mapPaginatedEntityList(bookings, BookingEto.class);
		bookingEtos.getSize();

		// Get the list of slot ids from bookingsList
		List<Integer> slotIdList = bookingEtos.stream().map(BookingEto::getSlotId).collect(Collectors.toList());

		// Getting the available time slots
		List<TimeSlotMasterEntity> availableSlotsList = timeSlotMasterEntityList.stream()
				.filter(e -> slotIdList.contains(e.getSlotId())).collect(Collectors.toList());

		availableSlotsList.get(0);

		return null;
	}

}
