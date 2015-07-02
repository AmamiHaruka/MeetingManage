package com.atm.vo;

/**
 * Noticeresponse entity. @author MyEclipse Persistence Tools
 */

public class Noticeresponse implements java.io.Serializable {

	// Fields

	private Integer responseId;
	private Boolean meetingAccessable;
	private String absentInfo;

	// Constructors

	/** default constructor */
	public Noticeresponse() {
	}

	/** full constructor */
	public Noticeresponse(Integer responseId, Boolean meetingAccessable,
			String absentInfo) {
		this.responseId = responseId;
		this.meetingAccessable = meetingAccessable;
		this.absentInfo = absentInfo;
	}

	// Property accessors

	public Integer getResponseId() {
		return this.responseId;
	}

	public void setResponseId(Integer responseId) {
		this.responseId = responseId;
	}

	public Boolean getMeetingAccessable() {
		return this.meetingAccessable;
	}

	public void setMeetingAccessable(Boolean meetingAccessable) {
		this.meetingAccessable = meetingAccessable;
	}

	public String getAbsentInfo() {
		return this.absentInfo;
	}

	public void setAbsentInfo(String absentInfo) {
		this.absentInfo = absentInfo;
	}

}