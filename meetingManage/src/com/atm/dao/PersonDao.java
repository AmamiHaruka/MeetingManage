package com.atm.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Person;

public class PersonDao implements PersonDaoInterface {
	private HibernateTemplate hibernateTemplate;
    public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public boolean updatePerson(Person person) {  
			try{
				this.getHibernateTemplate().update(person);  
//		        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		        hibernateTemplate.update(person);
				return true;
			}catch(Exception e){
				return false;
			}
//	        
	    }  

	
	public boolean addPerson(Person person) {
		try{
//			this.getHibernateTemplate().save(person);
//			this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
			hibernateTemplate.save(person);
			return true ;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public Person getPerson(int id) {
		//Person person =this.getHibernateTemplate().get(Person.class, new Integer(id));
		return hibernateTemplate.get(Person.class, new Integer(id));
	}

	public List<Person> search(String name, String departmentName, String gender) {
		if(gender.equals("")){
			String hql = "from com.atm.vo.Person p where p.department like? and p.name like? ";
//	        ArrayList<Person> list = (ArrayList<Person>) this.getHibernateTemplate().find(hql,new String[]{"%"+departmentName+"%","%"+name+"%" });
//	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
			
	        return   hibernateTemplate.find(hql,new String[]{"%"+departmentName+"%","%"+name+"%" });
		}else{
			String hql1 = "from com.atm.vo.Person p where p.department like? and p.name like? and p.gender =?";
//	        ArrayList<Person> list1 = (ArrayList<Person>) this.getHibernateTemplate().find(hql1,new String[]{"%"+departmentName+"%", "%"+name+"%" ,gender});
//	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   hibernateTemplate.find(hql1,new String[]{"%"+departmentName+"%", "%"+name+"%" ,gender});
		}
		
	}
	
	public boolean deletePerson(int id) {
		try{
//			Object department = getHibernateTemplate().get(Person.class, new Integer(id));
//		    getHibernateTemplate().delete(department);
//		    this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
			Object person = hibernateTemplate.get(Person.class, new Integer(id));
			hibernateTemplate.delete(person);
		    return true;
		}catch(Exception e){
			
			return false;
		}
		
	} 
}