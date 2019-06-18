package com.autoservice.bookingmanagement.logic.api.to;

import com.autoservice.bookingmanagement.common.api.Booking;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Booking
 */
public class BookingEto extends AbstractEto implements Booking {

	private static final long serialVersionUID = 1L;

	private String make;

	private String model;

	private String fuel;

	private String customerName;

	private String phoneNo;

	private String dateOfBooking;

	private Integer slotId;

	@Override
	public String getMake() {
		return make;
	}

	@Override
	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String getFuel() {
		return fuel;
	}

	@Override
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String getPhoneNo() {
		return phoneNo;
	}

	@Override
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String getDateOfBooking() {
		return dateOfBooking;
	}

	@Override
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	@Override
	public Integer getSlotId() {
		return slotId;
	}

	@Override
	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.make == null) ? 0 : this.make.hashCode());
		result = prime * result + ((this.model == null) ? 0 : this.model.hashCode());
		result = prime * result + ((this.fuel == null) ? 0 : this.fuel.hashCode());
		result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
		result = prime * result + ((this.phoneNo == null) ? 0 : this.phoneNo.hashCode());
		result = prime * result + ((this.dateOfBooking == null) ? 0 : this.dateOfBooking.hashCode());
		result = prime * result + ((this.slotId == null) ? 0 : this.slotId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// class check will be done by super type EntityTo!
		if (!super.equals(obj)) {
			return false;
		}
		BookingEto other = (BookingEto) obj;
		if (this.make == null) {
			if (other.make != null) {
				return false;
			}
		} else if (!this.make.equals(other.make)) {
			return false;
		}
		if (this.model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!this.model.equals(other.model)) {
			return false;
		}
		if (this.fuel == null) {
			if (other.fuel != null) {
				return false;
			}
		} else if (!this.fuel.equals(other.fuel)) {
			return false;
		}
		if (this.customerName == null) {
			if (other.customerName != null) {
				return false;
			}
		} else if (!this.customerName.equals(other.customerName)) {
			return false;
		}
		if (this.phoneNo == null) {
			if (other.phoneNo != null) {
				return false;
			}
		} else if (!this.phoneNo.equals(other.phoneNo)) {
			return false;
		}
		if (this.dateOfBooking == null) {
			if (other.dateOfBooking != null) {
				return false;
			}
		} else if (!this.dateOfBooking.equals(other.dateOfBooking)) {
			return false;
		}
		if (this.slotId == null) {
			if (other.slotId != null) {
				return false;
			}
		} else if (!this.slotId.equals(other.slotId)) {
			return false;
		}
		return true;
	}

}
