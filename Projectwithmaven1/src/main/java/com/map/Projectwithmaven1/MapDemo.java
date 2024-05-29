package com.map.Projectwithmaven1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// creating question
		Question q1=new Question();
		q1.setQuestionId(1111);
		q1.setQuestion("what is hibernate  ?");
		

		//creating answer
		
		Answer answer=new Answer();
		answer.setAnswerId(333);
		answer.setAnswer("hibernate framework");
	  q1.setAnswer(answer);
		
		
		// creating question
				Question q2=new Question();
				q2.setQuestionId(1122);
				q2.setQuestion("what is ORM  ?");
				

				//creating answer
				
				Answer answer1=new Answer();
				answer1.setAnswerId(444);
				answer1.setAnswer("object relational mapping");
				q2.setAnswer(answer1);
				
		
		//
		 Session s = factory.openSession();

			Transaction tx = s.beginTransaction();
			//save
			s.save(q1);
			s.save(q2);
			s.save(answer);
			s.save(answer1);
			tx.commit();
			s.close();
			factory.close();
		
		
	


 		
		factory.close();
		
		

	}

}
