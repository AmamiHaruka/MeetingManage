package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Meetingmanager;

public class MeetingmanagerDao extends HibernateDaoSupport {
	public void insert(Meetingmanager documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Meetingmanager queryById(int id){
		Meetingmanager mm = this.getHibernateTemplate().get(Meetingmanager.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return mm;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Meetingmanager.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Meetingmanager documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Meetingmanager> findAllEnterprises() { ////
		 
	        String hql = "from Meetingmanager mm";  
	        ArrayList<Meetingmanager> list = (ArrayList<Meetingmanager>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}
