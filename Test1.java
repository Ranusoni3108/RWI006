
public class Test1 extends Thread
{  
 public void run()
	{
		try
		{
		for(int i=1;i<=5;i++)
		{
		System.out.println(i);
		Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
		System.out.println("Thread interrupted:-"+e);
		}
	    }
 public static void main(String[] args) {
	   Test1 t=new Test1();
	   t.start();
	   t.interrupt();
	   }
 }
