package com.tut.Projectwithmaven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.AddResult;


/**
 * Hello world!
 * 
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Project started!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
      //creating object of student class
		Student st = new Student();
		  st.setId(108);
		st.setName("mahi");
		st.setCity("khargone");
		
		System.out.println(st);
		
		//creating object of address class
		Address a=new Address();
		a.setCity("indore");
	 Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(a);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Done...");
		 }
}
