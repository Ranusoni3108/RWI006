package Collectiondemo;

import java.util.LinkedList;

public class linklistaddLast {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("deepak");
		ll.add("rahul");
		ll.add(105);
		ll.add(124.7);
		ll.add('c');
		System.out.println(ll);
		ll.addLast("aaa");
		System.out.println(ll);

	}

}
