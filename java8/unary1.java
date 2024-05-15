package java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class unary1 {

	public static void main(String[] args) {
    Function<Integer,Integer>function1 =x->x*x;
    Function<String,String>function3 = str->str.toLowerCase();
  //  Function<String,Integer>function2 = str ->str.length();
   UnaryOperator<Integer>unaryOperator=x->x*x;
   System.out.println(unaryOperator.apply(5));
	}

}
