
public class Threademo22 extends Thread {
	 public void run() {
		 System.out.println("this is a thread class");
	 }
	 class Threadm extends Thread{
		 public void run() {
	   System.out.println("this is a thread class1");
		 }
	 }
	public static void main(String[] args) {
	Threademo22 td =new Threademo22();
	td.start();
	Threadm  td1=new Threademo22().new Threadm();
	td1.start();

	}

}
