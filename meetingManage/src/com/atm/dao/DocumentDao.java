package com.atm.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Document;

public class DocumentDao extends HibernateDaoSupport {
	public void insert(Document document){
		this.getHibernateTemplate().save(document);
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	}
	public Document queryById(int id){
		Document document=this.getHibernateTemplate().get(Document.class, new Integer(id));
		this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		return document;
	}
	public void delete(int documentId)
    {
       Object department = getHibernateTemplate().get(Document.class, new Integer(documentId));
       getHibernateTemplate().delete(department);
       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
    }

    public void update(Document document) {  

	        this.getHibernateTemplate().update(document);  
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

	    }  
	 public ArrayList<Document> findAllEnterprises() { ////
		 
	        String hql = "from Document document";  
	        ArrayList<Document> list = (ArrayList<Document>) this.getHibernateTemplate().find(hql);
	        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
            return   list;
	    } 
}
