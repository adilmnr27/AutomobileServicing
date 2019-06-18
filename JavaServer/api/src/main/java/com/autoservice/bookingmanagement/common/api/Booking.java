package com.autoservice.bookingmanagement.common.api;

import com.autoservice.general.common.api.ApplicationEntity;

public interface Booking extends ApplicationEntity {

	/**
	 * @return makeId
	 */
	public String getMake();

	/**
	 * @param make setter for make attribute
	 */
	public void setMake(String make);

	/**
	 * @return modelId
	 */
	public String getModel();

	/**
	 * @param model setter for model attribute
	 */
	public void setModel(String model);

	/**
	 * @return fuelId
	 */
	public String getFuel();

	/**
	 * @param fuel setter for fuel attribute
	 */
	public void setFuel(String fuel);

	/**
	 * @return customerNameId
	 */
	public String getCustomerName();

	/**
	 * @param customerName setter for customerName attribute
	 */
	public void setCustomerName(String customerName);

	/**
	 * @return phoneNoId
	 */
	public String getPhoneNo();

	/**
	 * @param phoneNo setter for phoneNo attribute
	 */
	public void setPhoneNo(String phoneNo);

	/**
	 * @return dateOfBookingId
	 */
	public String getDateOfBooking();

	/**
	 * @param dateOfBooking setter for dateOfBooking attribute
	 */
	public void setDateOfBooking(String dateOfBooking);

	/**
	 * @return slotIdId
	 */
	public Integer getSlotId();

	/**
	 * @param slotId setter for slotId attribute
	 */
	public void setSlotId(Integer slotId);

}
