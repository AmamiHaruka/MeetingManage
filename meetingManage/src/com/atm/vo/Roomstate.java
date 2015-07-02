package com.atm.vo;

/**
 * Roomstate entity. @author MyEclipse Persistence Tools
 */

public class Roomstate implements java.io.Serializable {

	// Fields

	private Integer roomId;
	private Integer monday;
	private Integer tuesday;
	private Integer wednesday;
	private Integer thursday;
	private Integer friday;
	private Integer saturday;
	private Integer sunday;

	// Constructors

	/** default constructor */
	public Roomstate() {
	}

	/** full constructor */
	public Roomstate(Integer roomId, Integer monday, Integer tuesday,
			Integer wednesday, Integer thursday, Integer friday,
			Integer saturday, Integer sunday) {
		this.roomId = roomId;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}

	// Property accessors

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getMonday() {
		return this.monday;
	}

	public void setMonday(Integer monday) {
		this.monday = monday;
	}

	public Integer getTuesday() {
		return this.tuesday;
	}

	public void setTuesday(Integer tuesday) {
		this.tuesday = tuesday;
	}

	public Integer getWednesday() {
		return this.wednesday;
	}

	public void setWednesday(Integer wednesday) {
		this.wednesday = wednesday;
	}

	public Integer getThursday() {
		return this.thursday;
	}

	public void setThursday(Integer thursday) {
		this.thursday = thursday;
	}

	public Integer getFriday() {
		return this.friday;
	}

	public void setFriday(Integer friday) {
		this.friday = friday;
	}

	public Integer getSaturday() {
		return this.saturday;
	}

	public void setSaturday(Integer saturday) {
		this.saturday = saturday;
	}

	public Integer getSunday() {
		return this.sunday;
	}

	public void setSunday(Integer sunday) {
		this.sunday = sunday;
	}

}