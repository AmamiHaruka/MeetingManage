package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Meetingmilestone;

public class MeetingmilestoneDao extends HibernateDaoSupport {
	public void insert(Meetingmilestone documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Meetingmilestone queryById(int id){
		Meetingmilestone mls = this.getHibernateTemplate().get(Meetingmilestone.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return mls;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Meetingmilestone.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Meetingmilestone documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	    }  
	 public ArrayList<Meetingmilestone> findAllEnterprises() { ////
		 
	        String hql = "Meetingmilestone mls";  
	        ArrayList<Meetingmilestone> list = (ArrayList<Meetingmilestone>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}