package com.atm.dao;

import java.util.List;

import com.atm.vo.Person;

import net.sf.json.JSONArray;

public interface PersonDAOInterface {
	public boolean addPerson(Person person);
	
	public Person getPerson(int id);
	
	//按条件查询 参数没有则为“”
	public List<Person> search(String name,String departmentName,String gender);
	public boolean deletePerson(int id);
	
}
