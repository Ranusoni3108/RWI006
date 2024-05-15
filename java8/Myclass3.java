package java8;
interface  C
{
	 static void say1Hello()
	{
		System.out.println("Hello...");
	}
	 default void sayBye()
	 {
		 System.out.println("Bye...!");
	 }

}
public class Myclass3  {

	public static void main(String[] args) {
		Myclass3 obj=new Myclass3();
		obj.sayBye();
		C.say1Hello();
	

	}

	private void sayBye() {
		// TODO Auto-generated method stub
		
	}
}
