package Thread;

import java.io.File;
import java.io.IOException;

public class kiles {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\HP\\desktop\\ranu1.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Sucessfully Create");
			}
			else {
				System.out.println("File Already exist..");
			}
			
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled..!");
		}
		// TODO Auto-generated method stub

	}



	}


