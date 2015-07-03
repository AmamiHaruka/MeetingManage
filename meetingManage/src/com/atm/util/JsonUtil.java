package com.atm.util;

import com.atm.vo.Person;

import net.sf.json.JSONObject;

public class JsonUtil {
	public static Person JsontoPerson(JSONObject object){
		Person p = new Person();
		p.setPassword(object.getString("password"));
		p.setEducation(object.getString("education"));
		p.setAddress(object.getString("address"));
		p.setAge(object.getInt("age"));
		p.setBirthday(object.getString("birthday"));
		p.setDepartment(object.getString("department"));
		p.setGender(object.getString("gender"));
		p.setId(object.getInt("id"));
		p.setName(object.getString("name"));
		p.setPosition(object.getString("position"));
		p.setSalary(object.getInt("salary"));
		p.setTel(object.getInt("tel"));
		return p;
	}
}
