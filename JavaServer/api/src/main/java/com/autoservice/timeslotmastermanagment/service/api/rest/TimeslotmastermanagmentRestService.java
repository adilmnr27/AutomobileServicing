package com.autoservice.timeslotmastermanagment.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.autoservice.timeslotmastermanagment.logic.api.Timeslotmastermanagment;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterEto;
import com.autoservice.timeslotmastermanagment.logic.api.to.TimeSlotMasterSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Timeslotmastermanagment}.
 */
@Path("/timeslotmastermanagment/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TimeslotmastermanagmentRestService {

	/**
	 * Delegates to {@link Timeslotmastermanagment#findTimeSlotMaster}.
	 *
	 * @param id the ID of the {@link TimeSlotMasterEto}
	 * @return the {@link TimeSlotMasterEto}
	 */
	@GET
	@Path("/timeslotmaster/{id}/")
	public TimeSlotMasterEto getTimeSlotMaster(@PathParam("id") long id);

	/**
	 * Delegates to {@link Timeslotmastermanagment#saveTimeSlotMaster}.
	 *
	 * @param timeslotmaster the {@link TimeSlotMasterEto} to be saved
	 * @return the recently created {@link TimeSlotMasterEto}
	 */
	@POST
	@Path("/timeslotmaster/")
	public TimeSlotMasterEto saveTimeSlotMaster(TimeSlotMasterEto timeslotmaster);

	/**
	 * Delegates to {@link Timeslotmastermanagment#deleteTimeSlotMaster}.
	 *
	 * @param id ID of the {@link TimeSlotMasterEto} to be deleted
	 */
	@DELETE
	@Path("/timeslotmaster/{id}/")
	public void deleteTimeSlotMaster(@PathParam("id") long id);

	/**
	 * Delegates to {@link Timeslotmastermanagment#findTimeSlotMasterEtos}.
	 *
	 * @param searchCriteriaTo the pagination and search criteria to be used for
	 *                         finding timeslotmasters.
	 * @return the {@link Page list} of matching {@link TimeSlotMasterEto}s.
	 */
	@Path("/timeslotmaster/search")
	@POST
	public Page<TimeSlotMasterEto> findTimeSlotMasters(TimeSlotMasterSearchCriteriaTo searchCriteriaTo);

}
