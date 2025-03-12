package com.genricUtlity;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class JavaUtlity {
	
	public String getSystemDateYYYYMMDD() {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		String StartDate=sdf.format(dateobj);
		return StartDate;		
	}	
	public static int random() {
		Random random=new Random();
		int num = random.nextInt();
		return num;
    //this method is created by harivardhan
	}
}
