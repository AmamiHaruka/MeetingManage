package com.atm.vo;

/**
 * Meetingmilestone entity. @author MyEclipse Persistence Tools
 */

public class Meetingmilestone implements java.io.Serializable {

	// Fields

	private Integer milestoneId;
	private Integer milestoneMeetingId;
	private String milestoneTarget;
	private String milestoneState;
	private String milestoneResponser;
	private Integer milestoneProcess;

	// Constructors

	/** default constructor */
	public Meetingmilestone() {
	}

	/** full constructor */
	public Meetingmilestone(Integer milestoneId, Integer milestoneMeetingId,
			String milestoneTarget, String milestoneState,
			String milestoneResponser, Integer milestoneProcess) {
		this.milestoneId = milestoneId;
		this.milestoneMeetingId = milestoneMeetingId;
		this.milestoneTarget = milestoneTarget;
		this.milestoneState = milestoneState;
		this.milestoneResponser = milestoneResponser;
		this.milestoneProcess = milestoneProcess;
	}

	// Property accessors

	public Integer getMilestoneId() {
		return this.milestoneId;
	}

	public void setMilestoneId(Integer milestoneId) {
		this.milestoneId = milestoneId;
	}

	public Integer getMilestoneMeetingId() {
		return this.milestoneMeetingId;
	}

	public void setMilestoneMeetingId(Integer milestoneMeetingId) {
		this.milestoneMeetingId = milestoneMeetingId;
	}

	public String getMilestoneTarget() {
		return this.milestoneTarget;
	}

	public void setMilestoneTarget(String milestoneTarget) {
		this.milestoneTarget = milestoneTarget;
	}

	public String getMilestoneState() {
		return this.milestoneState;
	}

	public void setMilestoneState(String milestoneState) {
		this.milestoneState = milestoneState;
	}

	public String getMilestoneResponser() {
		return this.milestoneResponser;
	}

	public void setMilestoneResponser(String milestoneResponser) {
		this.milestoneResponser = milestoneResponser;
	}

	public Integer getMilestoneProcess() {
		return this.milestoneProcess;
	}

	public void setMilestoneProcess(Integer milestoneProcess) {
		this.milestoneProcess = milestoneProcess;
	}

}