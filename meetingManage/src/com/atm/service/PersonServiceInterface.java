package com.atm.service;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.atm.vo.Person;

public interface PersonServiceInterface {
	public boolean deletePerson(int id);
	public boolean addPerson(JSONObject person);
	public Person getPerson(int id);
	public JSONArray search(String department,String name,String gander);
	public boolean modfiyPerson(JSONObject person);
}
