package com.autoservice.bookingmanagement.logic.impl.usecase;

import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.autoservice.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.autoservice.bookingmanagement.logic.api.usecase.UcMultipurpose;
import com.autoservice.bookingmanagement.logic.base.usecase.AbstractBookingUc;
import com.autoservice.bookingmanagement.logic.base.usecase.AbstractMultipurposeUc;


@Named
@Validated
@Transactional
public class UcMultipurposeImpl extends AbstractMultipurposeUc implements UcMultipurpose {

	@Override
	public BookingEto getAvailableSlots(BookingSearchCriteriaTo criteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
