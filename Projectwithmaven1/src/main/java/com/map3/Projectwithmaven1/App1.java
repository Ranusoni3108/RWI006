package com.map3.Projectwithmaven1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map2.Projectwithmaven1.Question1;


public class App1 {

	private static Question1 Question1;

	public static void main(String[] args) {
System.out.println( "Hello World!" );
        
        
        
        
        
        Configuration cgf=	new Configuration();
        cgf.configure("hibernate.cfg.xml");
        SessionFactory factory=cgf.buildSessionFactory();
        System.out.print(factory); 
        
   System.out.println("hello");

        
       Question2 qu=new Question2();
        qu.setQueid(123);
        qu.setQue("What is Interface");
        
        
        //   Answer for Store in database
        Answer2 an=new Answer2();
    an.setAnswerId(234);
    an.setAnswer("interface specifies the behavior of a class by providing an abstract type");
      an.setQue(Question1);
       
     Answer2 an1=new Answer2();
 an1.setAnswerId(235);
    an1.setAnswer("interface is a not a create Object ");
     an1.setQue(Question1);
      
    Answer2 an2=new Answer2();
   an2.setAnswerId(236);
      an2.setAnswer("interface is a Active Maltipale inheritance ");
    an2.setQue(Question1);

    List<Answer2>list=new ArrayList<Answer2>();
     list.add(an);
     list.add(an1);
      list.add(an2);
               
        //  qu.setAns(list);
        
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        
        
       // s.save(qu);
        
    //   s.save(an);
 //     s.save(an1);
  //      s.save(an2);
        
   Question1 que =(Question1)s.get(Question1.class,1111);
  System.out.println(qu.getQueid());
  System.out.println(qu.getQue());
      // Lazy
  
  Answer2 ans=new Answer2();
  System.out.println(an.getAnswer());
  System.out.println(an.getAnswerId());
  System.out.println(an1.getAnswer());
  System.out.println(an1.getAnswerId());
  System.out.println(an2.getAnswer());
  System.out.println(an2.getAnswerId());




  //System.out.println(qu.getAns().size());
      
        tx.commit();
        
        factory.close();
    
    }
}

	
