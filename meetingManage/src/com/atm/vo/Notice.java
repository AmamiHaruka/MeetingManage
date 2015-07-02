package com.atm.vo;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Integer meetingId;
	private Integer meetingLocation;
	private String meetingTime;
	private String meetingInfo;

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(Integer meetingId, Integer meetingLocation,
			String meetingTime, String meetingInfo) {
		this.meetingId = meetingId;
		this.meetingLocation = meetingLocation;
		this.meetingTime = meetingTime;
		this.meetingInfo = meetingInfo;
	}

	// Property accessors

	public Integer getMeetingId() {
		return this.meetingId;
	}

	public void setMeetingId(Integer meetingId) {
		this.meetingId = meetingId;
	}

	public Integer getMeetingLocation() {
		return this.meetingLocation;
	}

	public void setMeetingLocation(Integer meetingLocation) {
		this.meetingLocation = meetingLocation;
	}

	public String getMeetingTime() {
		return this.meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	public String getMeetingInfo() {
		return this.meetingInfo;
	}

	public void setMeetingInfo(String meetingInfo) {
		this.meetingInfo = meetingInfo;
	}

}