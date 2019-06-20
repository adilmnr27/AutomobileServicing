package com.autoservice.bookingmanagement.logic.api;

import com.autoservice.bookingmanagement.logic.api.usecase.UcFindBooking;
import com.autoservice.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.autoservice.bookingmanagement.logic.api.usecase.UcMultipurpose;

/**
 * Interface for Bookingmanagement component.
 */
public interface Bookingmanagement extends UcFindBooking, UcManageBooking, UcMultipurpose {

}
