package java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicate1 {

	public static void main(String[] args) {
	Predicate<Integer>predicateThatChecksEven=x->x%2==0;
	BiPredicate<Integer,Integer>bipredicate=(x,y)->x%2==0 && y%2==0;
    System.out.println(bipredicate.test(2, 4));
	
	}
}
