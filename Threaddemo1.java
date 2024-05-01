
public class Threaddemo1 implements Runnable
{
public void run()
{
System.out.println("this is thread class");
			
}
public void car() {
	System.out.println("gdxhjv");
}
public static void main(String args[])
{
Threaddemo1 th=new Threaddemo1();
Thread t1=new Thread(th);
th.run();
}

}
