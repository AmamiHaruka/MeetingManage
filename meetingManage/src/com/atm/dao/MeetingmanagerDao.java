package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Meeting;

public class MeetingmanagerDao extends HibernateDaoSupport {
	public void insert(Meeting documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Meeting queryById(int id){
		Meeting mm = this.getHibernateTemplate().get(Meeting.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return mm;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Meeting.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Meeting documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Meeting> findAllEnterprises() { ////
		 
	        String hql = "from Meetingmanager mm";  
	        ArrayList<Meeting> list = (ArrayList<Meeting>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}
