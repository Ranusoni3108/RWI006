package Collectiondemo;

import java.util.ArrayList;

public class ArraylistDemo4 {

	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(60);
		al1.add(30);
		al1.add(20);
		al1.add(50);
		
	ArrayList al2=new ArrayList();
	al2.add(120);
	al2.add("deepak");
	al2.add("rahul");
	al1.addAll(al2);
		System.out.println(al1);
		}
		}
