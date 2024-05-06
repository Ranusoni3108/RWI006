package Thread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class readwrite2 {

	public static void main(String[] args) {
try { 
			
			File f=new File("C:\\Users\\\\\\\\HP\\\\\\\\desktop\\\\\\\\ranu1.txt");
			FileWriter fw = new FileWriter(f);
			try 
			{
				  fw.write("Mr. sunil soni");
			}
			finally
			{
				fw.close();
			}
			System.out.println("Data wrote in files");
			}
			catch(IOException i){
				System.out.println(i);
			}
			// TODO Auto-generated method stub
			

	}

}
