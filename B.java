package Str.Ranu1;

 public class  B{

	public static void main(String[] args) {
		int[]a= {1,2,1,1,3,4,4,5};
		System.out.println("enter dublicate elements are");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j] && (i!=j))
			{
				System.out.println(a[j]);
			}

	}
		}
	}
 }


