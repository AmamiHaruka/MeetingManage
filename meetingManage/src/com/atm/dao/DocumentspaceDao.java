package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.atm.vo.Documentspace;

public class DocumentspaceDao extends HibernateDaoSupport{
	
	public void insert(Documentspace documentspace){
			this.getHibernateTemplate().save(documentspace);
			this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		}
		public Documentspace queryById(int id){
			Documentspace ds = this.getHibernateTemplate().get(Documentspace.class, new Integer(id));
			this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
			return ds;
		}
		public void delete(int documentspaceId)
	    {
	       Object department = getHibernateTemplate().get(Documentspace.class, new Integer(documentspaceId));
	       getHibernateTemplate().delete(department);
	       this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
	    }

	    public void update(Documentspace documentspace) {  

		        this.getHibernateTemplate().update(documentspace);  
		        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();

		    }  
		 public ArrayList<Documentspace> findAllEnterprises() { ////
			 
		        String hql = "from Documentspcae ds";  
		        ArrayList<Documentspace> list = (ArrayList<Documentspace>) this.getHibernateTemplate().find(hql);
		        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		        this.getHibernateTemplate().getSessionFactory().openSession().beginTransaction().commit();
		        return   list;
		    } 
}
