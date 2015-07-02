package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Milestone;

public class MeetingmilestoneDao extends HibernateDaoSupport {
	public void insert(Milestone documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Milestone queryById(int id){
		Milestone mls = this.getHibernateTemplate().get(Milestone.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return mls;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Milestone.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Milestone documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	    }  
	 public ArrayList<Milestone> findAllEnterprises() { ////
		 
	        String hql = "Meetingmilestone mls";  
	        ArrayList<Milestone> list = (ArrayList<Milestone>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}