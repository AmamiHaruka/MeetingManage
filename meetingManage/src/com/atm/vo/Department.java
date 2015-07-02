package com.atm.vo;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String responser;
	private String size;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(Integer id, String name, String responser, String size) {
		this.id = id;
		this.name = name;
		this.responser = responser;
		this.size = size;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResponser() {
		return this.responser;
	}

	public void setResponser(String responser) {
		this.responser = responser;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}