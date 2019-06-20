package com.autoservice.bookingmanagement.logic.api.usecase;

import org.springframework.data.domain.Page;

import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;

public interface UcMultipurpose {

	public Page<TimeSlotMasterEto> getAvailableSlots(BookingSearchCriteriaTo criteria);
}
