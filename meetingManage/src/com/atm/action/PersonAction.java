package com.atm.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.atm.vo.Person;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	public String addPerson() throws UnsupportedEncodingException{
		ServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("UTF-8");
		ServletResponse response=ServletActionContext.getResponse();
		PrintWriter out;
		BufferedReader br;
		try {
			out=response.getWriter();
			br=new BufferedReader(new InputStreamReader(request.getInputStream()));
			System.out.println(br.readLine());
			//System.out.println(JSONUtil.deserialize();
			out.print("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
