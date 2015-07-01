package com.atm.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.atm.util.HibernateSessionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {
	public String welcome(){
	
	}
}
