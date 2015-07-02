package com.atm.vo;

/**
 * Meetingmanager entity. @author MyEclipse Persistence Tools
 */

public class Meeting implements java.io.Serializable {

	// Fields

	private Integer id;
	private String reserveMan;
	private String meetingName;
	private String meetingResponser;
	private Integer meetingPnumber;
	private String meetingBeginTime;
	private String meetingEndTime;
	private String meetingDate;

	// Constructors

	/** default constructor */
	public Meeting() {
	}

	/** full constructor */
	public Meeting(Integer id, String reserveMan, String meetingName,
			String meetingResponser, Integer meetingPnumber,
			String meetingBeginTime, String meetingEndTime, String meetingDate) {
		this.id = id;
		this.reserveMan = reserveMan;
		this.meetingName = meetingName;
		this.meetingResponser = meetingResponser;
		this.meetingPnumber = meetingPnumber;
		this.meetingBeginTime = meetingBeginTime;
		this.meetingEndTime = meetingEndTime;
		this.meetingDate = meetingDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReserveMan() {
		return this.reserveMan;
	}

	public void setReserveMan(String reserveMan) {
		this.reserveMan = reserveMan;
	}

	public String getMeetingName() {
		return this.meetingName;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public String getMeetingResponser() {
		return this.meetingResponser;
	}

	public void setMeetingResponser(String meetingResponser) {
		this.meetingResponser = meetingResponser;
	}

	public Integer getMeetingPnumber() {
		return this.meetingPnumber;
	}

	public void setMeetingPnumber(Integer meetingPnumber) {
		this.meetingPnumber = meetingPnumber;
	}

	public String getMeetingBeginTime() {
		return this.meetingBeginTime;
	}

	public void setMeetingBeginTime(String meetingBeginTime) {
		this.meetingBeginTime = meetingBeginTime;
	}

	public String getMeetingEndTime() {
		return this.meetingEndTime;
	}

	public void setMeetingEndTime(String meetingEndTime) {
		this.meetingEndTime = meetingEndTime;
	}

	public String getMeetingDate() {
		return this.meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

}