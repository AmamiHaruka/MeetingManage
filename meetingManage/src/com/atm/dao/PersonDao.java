package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Person;

public class PersonDao extends HibernateDaoSupport {
	
	public String insertPerson(Person person){
		this.getHibernateTemplate().save(person);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return "1" ;
	}
	public Person queryById(int id){
		Person person =this.getHibernateTemplate().get(Person.class, new Integer(id));
		return person;
		
	}
	public ArrayList<Person> queryByDepartemnt(String dp){
		 String hql = "from vo.Person p where p.department=?";  
	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql,dp); 
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
         return   list;	
	}
	public ArrayList<Person> queryByName(String name){
		 String hql = "from vo.Person p where p.name like?";
	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql,"%"+name+"%");
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
      return   list;
	}
	
	public ArrayList<Person> queryByNameAndDepartment(String dp,String name){
		 String hql = "from vo.Person p where p.department like? and p.name like?";
	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql,new String[]{"%"+dp+"%", "%"+name+"%"});
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
     return   list;
	}
	
	public ArrayList<Person> queryByNameAndDepartmentAndSex(String dp,String name,String gender){
		 String hql = "from vo.Person p where p.department like? and p.name like? and p.gender like?";
	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql,new String[]{"%"+dp+"%", "%"+name+"%" ,"%"+gender+"%"});
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    return   list;
	}
	
	
	public void deleteById(int personId)
    {
       Object department = getHibernateTemplate().get(Person.class, new Integer(personId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

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
}