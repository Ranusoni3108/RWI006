public class A extends Thread
{
public void run()
{
System.out.println("This is a thread class");
}
public static void main(String[] args) 
{
 A a=new A();
 a.start();
 }
}
