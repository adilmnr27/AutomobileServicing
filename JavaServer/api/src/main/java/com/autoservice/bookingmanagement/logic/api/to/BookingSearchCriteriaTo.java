package com.autoservice.bookingmanagement.logic.api.to;

import com.autoservice.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.autoservice.bookingmanagement.common.api.Booking}s.
 */
public class BookingSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String make;

	private String model;

	private String fuel;

	private String customerName;

	private String phoneNo;

	private String dateOfBooking;

	private Integer slotId;

	private StringSearchConfigTo makeOption;

	private StringSearchConfigTo modelOption;

	private StringSearchConfigTo fuelOption;

	private StringSearchConfigTo customerNameOption;

	private StringSearchConfigTo phoneNoOption;

	private StringSearchConfigTo dateOfBookingOption;

	/**
	 * @return makeId
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make setter for make attribute
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return modelId
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model setter for model attribute
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return fuelId
	 */
	public String getFuel() {
		return fuel;
	}

	/**
	 * @param fuel setter for fuel attribute
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	/**
	 * @return customerNameId
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName setter for customerName attribute
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return phoneNoId
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo setter for phoneNo attribute
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return dateOfBookingId
	 */
	public String getDateOfBooking() {
		return dateOfBooking;
	}

	/**
	 * @param dateOfBooking setter for dateOfBooking attribute
	 */
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	/**
	 * @return slotIdId
	 */
	public Integer getSlotId() {
		return slotId;
	}

	/**
	 * @param slotId setter for slotId attribute
	 */
	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for {@link #getMake()
	 *         make}.
	 */
	public StringSearchConfigTo getMakeOption() {

		return this.makeOption;
	}

	/**
	 * @param makeOption new value of {@link #getMakeOption()}.
	 */
	public void setMakeOption(StringSearchConfigTo makeOption) {

		this.makeOption = makeOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getModel() model}.
	 */
	public StringSearchConfigTo getModelOption() {

		return this.modelOption;
	}

	/**
	 * @param modelOption new value of {@link #getModelOption()}.
	 */
	public void setModelOption(StringSearchConfigTo modelOption) {

		this.modelOption = modelOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for {@link #getFuel()
	 *         fuel}.
	 */
	public StringSearchConfigTo getFuelOption() {

		return this.fuelOption;
	}

	/**
	 * @param fuelOption new value of {@link #getFuelOption()}.
	 */
	public void setFuelOption(StringSearchConfigTo fuelOption) {

		this.fuelOption = fuelOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getCustomerName() customerName}.
	 */
	public StringSearchConfigTo getCustomerNameOption() {

		return this.customerNameOption;
	}

	/**
	 * @param customerNameOption new value of {@link #getCustomerNameOption()}.
	 */
	public void setCustomerNameOption(StringSearchConfigTo customerNameOption) {

		this.customerNameOption = customerNameOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getPhoneNo() phoneNo}.
	 */
	public StringSearchConfigTo getPhoneNoOption() {

		return this.phoneNoOption;
	}

	/**
	 * @param phoneNoOption new value of {@link #getPhoneNoOption()}.
	 */
	public void setPhoneNoOption(StringSearchConfigTo phoneNoOption) {

		this.phoneNoOption = phoneNoOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getDateOfBooking() dateOfBooking}.
	 */
	public StringSearchConfigTo getDateOfBookingOption() {

		return this.dateOfBookingOption;
	}

	/**
	 * @param dateOfBookingOption new value of {@link #getDateOfBookingOption()}.
	 */
	public void setDateOfBookingOption(StringSearchConfigTo dateOfBookingOption) {

		this.dateOfBookingOption = dateOfBookingOption;
	}

}
