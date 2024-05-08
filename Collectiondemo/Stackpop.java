package Collectiondemo;

import java.util.Stack;

public class Stackpop {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("deepak");
		s.add("amit");
		s.add(200);
		s.add(100.10);
		System.out.println(s);
		//System.out.println(s.pop());
		//System.out.println(s);
		//System.out.println(s.pop());
	//	System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
		}
	}
