package com.atm.vo;

/**
 * Documentspace entity. @author MyEclipse Persistence Tools
 */

public class Documentspace implements java.io.Serializable {

	// Fields

	private String url;
	private String name;
	private Integer type;

	// Constructors

	/** default constructor */
	public Documentspace() {
	}

	/** full constructor */
	public Documentspace(String url, String name, Integer type) {
		this.url = url;
		this.name = name;
		this.type = type;
	}

	// Property accessors

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}