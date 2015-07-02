package com.atm.vo;

/**
 * Meetingroom entity. @author MyEclipse Persistence Tools
 */

public class Meetingroom implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer size;
	private Integer number;

	// Constructors

	/** default constructor */
	public Meetingroom() {
	}

	/** full constructor */
	public Meetingroom(Integer id, Integer size, Integer number) {
		this.id = id;
		this.size = size;
		this.number = number;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}