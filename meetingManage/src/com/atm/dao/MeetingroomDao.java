package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Meetingroom;

public class MeetingroomDao extends HibernateDaoSupport {
	public void insert(Meetingroom documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Meetingroom queryById(int id){
		Meetingroom mr = this.getHibernateTemplate().get(Meetingroom.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return mr;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Meetingroom.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Meetingroom documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Meetingroom> findAllEnterprises() { ////
		 
	        String hql = "from Meetingroom mt";  
	        ArrayList<Meetingroom> list = (ArrayList<Meetingroom>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}