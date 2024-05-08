package Collectiondemo;

import java.util.Stack;

public class Stacksearch 
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("deepak");
		s.add("amit");
		s.add(200);
		s.add(100.10);
		System.out.println(s.search(100.10));
		//System.out.println(s.search(100.20));

		}
	}
