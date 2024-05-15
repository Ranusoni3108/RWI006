package java8;

import java.util.function.Predicate;

public class Predicateequal {
	public static void main(String args[])
	{
		Predicate<String>StartsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
	     Predicate<String>endsWithLetterL=x->x.toLowerCase().charAt(x.length()-1)=='l';
	     Predicate<Object>predicate=Predicate.isEqual("Vipul");
	     System.out.println(predicate.test("Vipul"));
	}
	}


