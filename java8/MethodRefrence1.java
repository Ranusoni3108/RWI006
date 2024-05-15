package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence1 {
public static void print(String s)
{
	System.out.println(s);
	}
public static void main(String args[])
{
List<String>students=Arrays.asList("Alice","Bop","Charlie");
students.forEach(x->System.out.println(x));

}
}
