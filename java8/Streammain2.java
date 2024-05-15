package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streammain2 {
public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(2,4,50,21,22,67);
		   //using stream
		Stream<Integer>stream=list1.stream();
		 List<Integer>newList=stream.filter(i->i%2 == 0).collect(Collectors.toList());
		  System.out.println(newList);
		  }

}
