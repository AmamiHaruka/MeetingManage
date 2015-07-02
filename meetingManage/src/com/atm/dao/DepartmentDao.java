package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Department;

public class DepartmentDao extends HibernateDaoSupport {

	public void insert(Department department){
		//this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction();
		this.getHibernateTemplate().save(department);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		System.out.println(department.getName());
	}
	public void queryById(int id){
		this.getHibernateTemplate().get(Department.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public void delete(int departmentId)
    {
       Object department = getHibernateTemplate().get(Department.class, new Integer(departmentId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Department department) {  

	        this.getHibernateTemplate().update(department);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Department> findAllEnterprises() { ////
		 
	        String hql = "from Department department";  
	        ArrayList<Department> list = (ArrayList<Department>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
            return   list;
            
	    } 
}
