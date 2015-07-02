package com.atm.vo;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer age;
	private String birthday;
	private String address;
	private Integer tel;
	private String education;
	private String password;
	private String position;
	private Integer salary;
	private String department;
	private String gender;

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(Integer id, String name, Integer age, Integer tel,
			String education, String password, String position,
			String department, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.education = education;
		this.password = password;
		this.position = position;
		this.department = department;
		this.gender = gender;
	}

	/** full constructor */
	public Person(Integer id, String name, Integer age, String birthday,
			String address, Integer tel, String education, String password,
			String position, Integer salary, String department, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
		this.tel = tel;
		this.education = education;
		this.password = password;
		this.position = position;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
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

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}