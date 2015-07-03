package com.atm.action;

import com.atm.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

public class personAction extends ActionSupport{
	private PersonService personService;
	private int id;
	private String name;
	private String department;
	private String gender;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public PersonService getPersonService() {
		return personService;
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String execute(){
		if(personService.getPerson(id).getName()!=null){
			System.out.println(personService.getPerson(id).getName());
			return "success";
		}else{
			return "fail";
		}
		
	}
	public String SearchPerson(){
		System.out.println(personService.search(department, name, gender));
	
		return "success";
	}
	public String deletePerson(){
		if(personService.deletePerson(id)){
			return "success";
		}else{
			return "fail";
		}
	}
}
