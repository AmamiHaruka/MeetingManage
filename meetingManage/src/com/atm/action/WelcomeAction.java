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

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {
	public String welcome() throws IOException{
		ServletResponse response=ServletActionContext.getResponse();
		//BufferedReader br=new BufferedReader(new InputStreamReader(request.getInputStream()));
		PrintWriter out=response.getWriter();
		JSONObject j=new JSONObject();
		j.put("name", "dps");
		j.put("age",10);
		out.print(j);
		return null;
	
	}
	public String toIndex(){
		return SUCCESS;
	}
}
