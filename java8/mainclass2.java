package java8;
interface A
{
default void sayhello()
	{
		System.out.println("Hello");
	}
}
interface B
{
	default void sayhello()
	{

		System.out.println("hello guys");
	}
}

public class mainclass2 implements A,B {

	public static void main(String[] args) {
		mainclass2 m1=new mainclass2();
		m1.sayhello();
		}
	@Override
	public void sayhello() {
		// TODO Auto-generated method stub
		B.super.sayhello();
	}

}
