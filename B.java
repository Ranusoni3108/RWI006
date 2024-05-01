//Performing Single task from single Thread

public class B extends Thread
{
	public void run()
	{
	System.out.println("task1");
	}
public static void main(String[] args) {
	B b=new B();
	b.start();
	}
}
