package com.atm.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atm.dao.PersonDao;
import com.atm.vo.Person;

public class PersonService implements PersonServiceInterface {
	private PersonDao dao;
	private ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	public PersonService(){ 
		this.dao=(PersonDao) ctx.getBean("personDao");
	}
	@Override
	public boolean deletePerson(int id) {
		if(dao.deletePerson(id)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean addPerson(Person person) {
		if(dao.addPerson(person)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Person getPerson(int id) {
		return dao.getPerson(id);
	}

	@Override
	public List<Person> search(String departmentName, String name, String gender) {
		return dao.search(name, departmentName, gender);
	}
	

}
