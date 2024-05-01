// performing single task from multiple Threads 
public class Testt1 extends Thread

{
public void run()
{
	System.out.println("task 2");
}
	public static void main(String[] args) {
		Testt1 t=new Testt1();
		t.start();
		Testt1 t1=new Testt1();
		t1.start();
}
		}
	


