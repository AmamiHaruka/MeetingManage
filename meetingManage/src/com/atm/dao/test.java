package com.atm.dao;

import java.util.ArrayList;

import javax.transaction.Transaction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.atm.vo.Department;
import com.atm.vo.Person;

public class test {
public static void main(String[] args){
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	PersonDao pd=(PersonDao)ctx.getBean("personDao");
	ArrayList<Person> p=new ArrayList<Person>();
	//p=pd.findAllPerson();
	Person person = new Person(5, "zlb", 20, "1111", "addd", 123, "edu", "password", "position", 11, "department", "gender");
	
	pd.insertPerson(person);
	
	p=pd.findAllPerson();
	for(Person shit :p)
	 {
	 System.out.println(shit.getName());
	}
	

	
	

	
}
}
