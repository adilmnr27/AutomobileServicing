package com.autoservice.bookingmanagement.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.autoservice.bookingmanagement.logic.api.Bookingmanagement;
import com.autoservice.bookingmanagement.logic.api.to.BookingEto;
import com.autoservice.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.autoservice.timeslotmastermanagment.common.api.TimeSlotMaster;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Bookingmanagement}.
 */
@Path("/bookingmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface BookingmanagementRestService {

	/**
	 * Delegates to {@link Bookingmanagement#findBooking}.
	 *
	 * @param id the ID of the {@link BookingEto}
	 * @return the {@link BookingEto}
	 */
	@GET
	@Path("/booking/{id}/")
	public BookingEto getBooking(@PathParam("id") long id);

	/**
	 * Delegates to {@link Bookingmanagement#saveBooking}.
	 *
	 * @param booking the {@link BookingEto} to be saved
	 * @return the recently created {@link BookingEto}
	 */
	@POST
	@Path("/booking/")
	public BookingEto saveBooking(BookingEto booking);

	/**
	 * Delegates to {@link Bookingmanagement#deleteBooking}.
	 *
	 * @param id ID of the {@link BookingEto} to be deleted
	 */
	@DELETE
	@Path("/booking/{id}/")
	public void deleteBooking(@PathParam("id") long id);

	/**
	 * Delegates to {@link Bookingmanagement#findBookingEtos}.
	 *
	 * @param searchCriteriaTo the pagination and search criteria to be used for
	 *                         finding bookings.
	 * @return the {@link Page list} of matching {@link BookingEto}s.
	 */
	@Path("/booking/search")
	@POST
	public Page<BookingEto> findBookings(BookingSearchCriteriaTo searchCriteriaTo);

	@Path("/booking/getAvailableSlots")
	@POST
	public Page<TimeSlotMasterEto> getAvailableSlots(BookingSearchCriteriaTo searchCriteriaTo);

}
