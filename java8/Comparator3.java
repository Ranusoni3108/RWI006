package java8;

import java.util.Map;
import java.util.TreeMap;

public class Comparator3 {

	public static void main(String[] args) {
		Map<Integer,String>m=new TreeMap<>();
		m.put(2, "z");
		m.put(3, "f");
		m.put(1, "Y");
		System.out.println("Before manual sorting:"+m);
		Map<Integer,String>mm=new TreeMap<>((a,b)->b-a);
		mm.put(2, "z");
		mm.put(3, "f");
		mm.put(1, "Y");
		System.out.println("After manual sorting:"+mm);
	}

}
