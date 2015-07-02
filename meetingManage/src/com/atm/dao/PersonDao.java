package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Person;

public class PersonDao extends HibernateDaoSupport implements PersonDAOInterface {
    public void updatePerson(Person documentspace) {  
	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        
	    }  
	 public ArrayList<Person> findAllPerson() { ////
		 
	        String hql = "from Person p";  
	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
            return   list;
	    }
	@Override
	public boolean addPerson(Person person) {
		this.getHibernateTemplate().save(person);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return true ;
	}
	@Override
	public Person getPerson(int id) {
		Person person =this.getHibernateTemplate().get(Person.class, new Integer(id));
		return person;
	}
	@Override
	public List<Person> search(String name, String departmentName, String gender) {
		if(gender.equals("")){
			String hql = "from com.atm.vo.Person p where p.department like? and p.name like? ";
	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql,new String[]{"%"+departmentName+"%","%"+name+"%" });
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
		}else{
			String hql1 = "from com.atm.vo.Person p where p.department like? and p.name like? and p.gender =?";
	        ArrayList<Person> list1 = (ArrayList<Person>) this.getHibernateTemplate().find(hql1,new String[]{"%"+departmentName+"%", "%"+name+"%" ,gender});
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list1;
		}
		
	}
	@Override
	public boolean deletePerson(int id) {
		Object department = getHibernateTemplate().get(Person.class, new Integer(id));
	    getHibernateTemplate().delete(department);
	    this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	    return true;
	} 
}