package java8;

public class Myclass implements Runnable {
	@Override
public void run()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println("Hello  " + i);
	}
}
}
