package com.atm.service;

import java.util.List;

import com.atm.vo.Person;

public interface PersonServiceInterface {
	public boolean deletePerson(int id);
	public boolean addPerson(Person person);
	public Person getPerson(int id);
	public List<Person> search(String department,String name,String gander);
}
