package java8;

import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
	Supplier<Integer>supplier=() -> 10;
	System.out.println(supplier.get());
	}
}
