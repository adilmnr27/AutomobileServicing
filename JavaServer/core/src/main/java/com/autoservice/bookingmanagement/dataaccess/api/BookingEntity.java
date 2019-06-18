package com.autoservice.bookingmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.autoservice.bookingmanagement.common.api.Booking;
import com.autoservice.general.dataaccess.api.ApplicationPersistenceEntity;

@Entity
@Table(name = "Booking")
public class BookingEntity extends ApplicationPersistenceEntity implements Booking {

	private String make;

	private String model;

	private String fuel;

	private String customerName;

	private String phoneNo;

	private String dateOfBooking;

	private Integer slotId;

	private static final long serialVersionUID = 1L;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

}
