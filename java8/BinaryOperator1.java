package java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperator1 
{
    public static void main(String[] args) 
    {
    	
	BiFunction<String,String,String>biFunction=(str1,str2)->str1+str2;
    BinaryOperator<String>binaryOperator=(str1,str2)->str1+str2;
    System.out.println(binaryOperator.apply("Hello", "world"));
	}
}
