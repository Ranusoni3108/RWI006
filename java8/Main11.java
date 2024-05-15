package java8;
public class Main11 {
	public static void main(String args[])
	{
		Employee1 emp=new Employee1()
		
		{

			@Override
			public String getsalary() {
			return "100";
			}

			@Override
			public String getDesignation() {
				return "Software Engineer";
			}
			
		};
		System.out.println(emp.getsalary());
	}
}		
	


