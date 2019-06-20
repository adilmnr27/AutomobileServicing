package com.autoservice.timeslotmastermanagment.logic.api.to;

import com.autoservice.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.autoservice.timeslotmastermanagment.common.api.TimeSlotMaster}s.
 */
public class TimeSlotMasterSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String duration;

	private String slotTime;

	private Integer slotId;

	private StringSearchConfigTo durationOption;

	private StringSearchConfigTo slotTimeOption;

	/**
	 * @return durationId
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration setter for duration attribute
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return slotTimeId
	 */
	public String getSlotTime() {
		return slotTime;
	}

	/**
	 * @param slotTime setter for slotTime attribute
	 */
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
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
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getDuration() duration}.
	 */
	public StringSearchConfigTo getDurationOption() {

		return this.durationOption;
	}

	/**
	 * @param durationOption new value of {@link #getDurationOption()}.
	 */
	public void setDurationOption(StringSearchConfigTo durationOption) {

		this.durationOption = durationOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getSlotTime() slotTime}.
	 */
	public StringSearchConfigTo getSlotTimeOption() {

		return this.slotTimeOption;
	}

	/**
	 * @param slotTimeOption new value of {@link #getSlotTimeOption()}.
	 */
	public void setSlotTimeOption(StringSearchConfigTo slotTimeOption) {

		this.slotTimeOption = slotTimeOption;
	}

}
