public class Test3 extends Thread
{
   public void run()
	{
	System.out.println(Thread.currentThread().isDaemon());
	System.out.println("Daemon thread");	
	}
    public static void main(String[] args)
	{
	System.out.println("Main thread");
	Test3 t=new Test3();
	t.setDaemon(true);
	t.start();
	}
    }
