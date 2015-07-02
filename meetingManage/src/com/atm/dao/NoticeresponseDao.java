package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Noticeresponse;

public class NoticeresponseDao extends HibernateDaoSupport {
	public void insert(Noticeresponse documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Noticeresponse queryById(int id){
		Noticeresponse ntr = this.getHibernateTemplate().get(Noticeresponse.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return ntr;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Noticeresponse.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Noticeresponse documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Noticeresponse> findAllEnterprises() { ////
		 
	        String hql = "from Noticeresponse ntr";  
	        ArrayList<Noticeresponse> list = (ArrayList<Noticeresponse>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}
