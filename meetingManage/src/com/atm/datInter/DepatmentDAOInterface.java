package com.atm.datInter;

import java.util.List;

import com.atm.vo.Person;

public interface DepatmentDAOInterface {
public boolean addDepartment(Person person);
	
	public Person getDepartment(int id);
	
	//按条件查询 参数没有则为“”
	//public List<Person> search(String name,String departmentName,String gendar);
	public boolean deleteDepartment(int id);
	public boolean modifyDepartment(Person person);
}
