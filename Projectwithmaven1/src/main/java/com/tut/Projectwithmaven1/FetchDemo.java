package com.tut.Projectwithmaven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
	//get load method

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		 
	   Student student	= (Student)session.load(Student.class,5);
	   System.out.println(student);
	   
	 //  Address a= (Address)session.get(Address.class,"Indore");
	//	System.out.println(a);
		 
		 session.close();
		 factory.close();
		 }
	}
