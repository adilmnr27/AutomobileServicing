package com.autoservice.timeslotmastermanagment.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.autoservice.general.dataaccess.api.ApplicationPersistenceEntity;
import com.autoservice.timeslotmastermanagment.common.api.TimeSlotMaster;

@Entity
@Table(name = "TimeSlotMaster")
public class TimeSlotMasterEntity extends ApplicationPersistenceEntity implements TimeSlotMaster {

	private String duration;

	private String slotTime;

	private Integer slotId;

	private static final long serialVersionUID = 1L;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

}
