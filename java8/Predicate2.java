package java8;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		Predicate<Integer>isEven= x-> x%2==0;
        Predicate<String>StartsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
        System.out.println(StartsWithLetterV.test("Hello"));
	}

}
