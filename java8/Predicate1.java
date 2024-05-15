package java8;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
	Predicate<Integer>salarygreatethan100000predicates = x-> x>10000000;
	System.out.println(salarygreatethan100000predicates.test(100000000));

	}

}
