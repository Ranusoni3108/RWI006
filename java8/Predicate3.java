package java8;

import java.util.function.Predicate;

public class Predicate3 {
	public static void main(String args[])
	{
	 Predicate<String>StartsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
     Predicate<String>endsWithLetterL=x->x.toLowerCase().charAt(x.length()-1)=='l';
     Predicate<String>and=StartsWithLetterV.and(endsWithLetterL);
     System.out.println(and.test("vipul"));
	}
}
