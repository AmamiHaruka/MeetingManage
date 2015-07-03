package com.atm.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.json.JSONUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atm.dao.PersonDao;
import com.atm.util.DateUtil;
import com.atm.util.JsonUtil;
import com.atm.vo.Person;

public class PersonService implements PersonServiceInterface {
	private PersonDao personDao;
//	private ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//	public PersonService(){ 
//		this.dao=(PersonDao) ctx.getBean("personDao");
//	}
	public PersonDao getPersonDao() {
		return personDao;
	}


	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public boolean deletePerson(int id) {
		if(personDao.deletePerson(id)){
			return true;
		}else{
			return false;
		}
	}
	public boolean addPerson(JSONObject person) {
		
		//person.setId(DateUtil.getnum());
		if(personDao.addPerson(JsonUtil.JsontoPerson(person))){
			return true;
		}else{
			return false;
		}
	}

	
	public Person getPerson(int id) {
		try{
			System.out.println(personDao.getPerson(id).getName());
			return personDao.getPerson(id);
		}catch(Exception e){
			Person p =new Person();
			System.out.println(p.getName());
			return p;
		}
		
	}

	public JSONArray search(String departmentName, String name, String gender) {
		System.out.println(name);
		System.out.println(personDao.search(name, departmentName, gender));
		return JSONArray.fromObject(personDao.search(name, departmentName, gender));
		
	}


	
	public boolean modfiyPerson(JSONObject person) {
		if(personDao.updatePerson(JsonUtil.JsontoPerson(person))){
			return true;
		}else{
			return false;
		}
	}
	

}
