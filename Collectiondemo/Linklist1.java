package Collectiondemo;

import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("deepak");
	ll.add("rahul");
	ll.add(105);
	ll.add(11);
	ll.add(12.14);
	ll.add('p');
	ll.add(null);
	ll.add(null);
	System.out.println(ll);
	ll.addFirst("bbb");
	ll.add(7);
	ll.add(5);
	ll.add("ranu");
	ll.add("Priyanshi");
	ll.add(7.8);
	ll.add('p');
	ll.add(null);
	ll.add(null);
	System.out.println(ll);
	ll.addFirst("aaa");
	ll.addLast("ddd");
	System.out.println(ll);
	ll.removeFirst();
	ll.removeLast();
	ll.add(8, "mayuri");
	ll.set(7, "e");
	ll.remove();
	System.out.println(ll);
	ll.remove();//fifo
	System.out.println(ll);
	System.out.println(ll.contains("mayuri"));
	}

}

