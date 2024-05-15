package java8;

import java.util.function.Predicate;

public class predicate4 {

	public static void main(String[] args) {
		 Predicate<String>StartsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
	     Predicate<String>endsWithLetterL=x->x.toLowerCase().charAt(x.length()-1)=='l';
	     Predicate<String>or=StartsWithLetterV.or(endsWithLetterL);
	     System.out.println(or.test("Vivek"));
		}

	}


