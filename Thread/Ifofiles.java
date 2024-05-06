package Thread;

import java.io.File;

public class Ifofiles {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\HP\\desktop\\ranu1.txt");
		if(f.exists())
		{
			System.out.println("File Name ="+f.getName());
			System.out.println("File Path="+f.getAbsolutePath());
			System.out.println("File write ="+f.canWrite());
			System.out.println("File length ="+f.length());
			System.out.println("File Read ="+f.canRead());
			System.out.println("File Remove ="+f.delete());
			
		}else {
			System.out.println("File does not exist" );
		}
	}

}
