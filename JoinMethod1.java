
public class JoinMethod1 extends Thread {
public void run()
	{
for(int i=0;i<=3;i++)
{
try
{
Thread.sleep(2000);
System.out.println("current thread:"+Thread.currentThread().getName());
}
catch(Exception e)
{
System.out.println("Exception has "+e);
}
System.out.println(i);
}
}
public static void main(String[] args) {
JoinMethod1 t1=new JoinMethod1();
JoinMethod1 t2=new JoinMethod1();
JoinMethod1 t3=new JoinMethod1();
t1.start();
	{
try
	{
	System.out.println("current thread:"+Thread.currentThread().getName());
		t1.join();
		}
	
catch(Exception e)
{
System.out.println("Exception has......... "+e);
}
 t2.start();
{
try
	{
 System.out.println("current thread////:"+Thread.currentThread().getName());
	t2.join();
			}
		catch(Exception e)
			{
	System.out.println("Exception has..../////..... "+e);
    }
	t3.start();
		}
	}
	}
		}

