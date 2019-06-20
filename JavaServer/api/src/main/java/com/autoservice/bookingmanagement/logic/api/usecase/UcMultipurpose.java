package com.autoservice.bookingmanagement.logic.api.usecase;

import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;

public interface UcMultipurpose {

	public BookingEto getAvailableSlots(BookingSearchCriteriaTo criteria);
}
