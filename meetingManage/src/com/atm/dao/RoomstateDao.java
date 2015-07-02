package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Roomstate;

public class RoomstateDao extends HibernateDaoSupport {
	public void insert(Roomstate documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Roomstate queryById(int id){
		Roomstate rst = this.getHibernateTemplate().get(Roomstate.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return rst;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Roomstate.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Roomstate documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Roomstate> findAllEnterprises() { ////
		 
	        String hql = "from Roomstate rs";  
	        ArrayList<Roomstate> list = (ArrayList<Roomstate>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}