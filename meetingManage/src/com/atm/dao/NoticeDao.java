package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Notice;

public class NoticeDao extends HibernateDaoSupport {
	public void insert(Notice documentspace){
		this.getHibernateTemplate().save(documentspace);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Notice queryById(int id){
		Notice notice = this.getHibernateTemplate().get(Notice.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return notice;
	}
	public void delete(int documentspaceId)
    {
       Object department = getHibernateTemplate().get(Notice.class, new Integer(documentspaceId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Notice documentspace) {  

	        this.getHibernateTemplate().update(documentspace);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Notice> findAllEnterprises() { ////
		 
	        String hql = "from Notice nt";  
	        ArrayList<Notice> list = (ArrayList<Notice>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	        return   list;
	    } 
}