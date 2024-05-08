package Collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class linklist3 
{
public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		LinkedList ll=new LinkedList(al);
		ll.add("deepak");
		ll.add("rahul");
		ll.add(105);
		ll.add(124.7);
		ll.add('c');
		
		System.out.println(ll);
		}
	}


