package Collectiondemo;

import java.util.ArrayList;

public class Arraylistremoveall {

	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add("deepak");
		al1.add(40);
		al1.add(90);
		al1.add(50);
		
		ArrayList al2=new ArrayList();
		al2.add(90);
		al2.add("deepak");
		al2.add(120);
		al2.add("rahul");
		al1.removeAll(al2);
		
		System.out.println(al1);
		}
}


	


