package java8;

import java.util.function.Function;

public class main5 {

	public static void main(String[] args) {
	Function<String,Integer>function=x -> x.length();
     System.out.println(function.apply("Vipul"));
}
}
