package com.autoservice.timeslotmastermanagment.logic.api.to;

import com.autoservice.timeslotmastermanagment.common.api.TimeSlotMaster;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of TimeSlotMaster
 */
public class TimeSlotMasterEto extends AbstractEto implements TimeSlotMaster {

	private static final long serialVersionUID = 1L;

	private String duration;

	private String slotTime;

	private Integer slotId;

	@Override
	public String getDuration() {
		return duration;
	}

	@Override
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String getSlotTime() {
		return slotTime;
	}

	@Override
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
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
		result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());
		result = prime * result + ((this.slotTime == null) ? 0 : this.slotTime.hashCode());
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
		TimeSlotMasterEto other = (TimeSlotMasterEto) obj;
		if (this.duration == null) {
			if (other.duration != null) {
				return false;
			}
		} else if (!this.duration.equals(other.duration)) {
			return false;
		}
		if (this.slotTime == null) {
			if (other.slotTime != null) {
				return false;
			}
		} else if (!this.slotTime.equals(other.slotTime)) {
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
