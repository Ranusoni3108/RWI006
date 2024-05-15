package java8;

import java.util.function.Predicate;

public class Predicatenegate {

	public static void main(String[] args) {
		 Predicate<String>StartsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
	     Predicate<String>endsWithLetterL=x->x.toLowerCase().charAt(x.length()-1)=='l';
	     System.out.println(StartsWithLetterV.negate().test("vipul"));
	}
	}


