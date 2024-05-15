package java8;

import java.util.function.Consumer;

public class Biconsumer
{
public static void main(String[] args) {
	Consumer<Integer>consumer=(x)->{
    System.out.println(x);
	};
	consumer.accept(28);
	}
}
