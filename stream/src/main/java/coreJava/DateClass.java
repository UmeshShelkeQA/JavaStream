package coreJava;

import java.util.Date;
import java.util.Properties;
import java.util.Set;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Todays Week Day :" + new Date().getDay());
		System.out.println("Todays Month Day :" + new Date().getDate());
		System.out.println("Todays current time in millisecond :" + new Date().getTime());
		System.out.println("Todays Month Day :" + new Date().getDate());
		
		Properties p =System.getProperties();
		Set<Object> key = p.keySet();
		for(Object s : key) {
			System.out.println("key : "+ s.toString()+" | value : " + p.getProperty((String) s));
		}
	
		
		
	}

}
