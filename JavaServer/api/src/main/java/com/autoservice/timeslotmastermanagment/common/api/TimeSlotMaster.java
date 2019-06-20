package com.autoservice.timeslotmastermanagment.common.api;

import com.autoservice.general.common.api.ApplicationEntity;

public interface TimeSlotMaster extends ApplicationEntity {

	/**
	 * @return durationId
	 */
	public String getDuration();

	/**
	 * @param duration setter for duration attribute
	 */
	public void setDuration(String duration);

	/**
	 * @return slotTimeId
	 */
	public String getSlotTime();

	/**
	 * @param slotTime setter for slotTime attribute
	 */
	public void setSlotTime(String slotTime);

	/**
	 * @return slotIdId
	 */
	public Integer getSlotId();

	/**
	 * @param slotId setter for slotId attribute
	 */
	public void setSlotId(Integer slotId);

}
