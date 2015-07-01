package com.atm.dao;

import com.atm.vo.Person;

import net.sf.json.JSONArray;

public interface PersonDAOInterface {
	public boolean addPerson(Person person);
	//得到全部人的Json数组
	public JSONArray getAllPerson();
	//按条件查询 参数没有则为“”
	public JSONArray Query(String name,String departmentName,String gendar);
	public boolean deletePerson();
	public boolean modifyPerson();
}
