package com.atm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static int getnum(){
		Date  date = new Date();
		SimpleDateFormat matter1=new SimpleDateFormat("yyyy");
		String i  =matter1.format(date);
		int year = Integer.valueOf(i).intValue()-2000;
		return year;
	}
}
