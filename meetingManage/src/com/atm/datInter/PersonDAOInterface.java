package com.atm.datInter;

import java.util.List;

import com.atm.vo.Person;

import net.sf.json.JSONArray;

public interface PersonDAOInterface {
	public boolean addPerson(Person person);
	
	public Person getPerson(int id);
	
	//按条件查询 参数没有则为“”
	public List<Person> search(String name,String departmentName,String gendar);
	public boolean deletePerson(int id);
	public boolean modifyPerson(Person person);
}
