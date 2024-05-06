package Thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
public static void main(String[] args) {
			  try (FileInputStream read = new FileInputStream("C:\\\\Users\\\\HP\\\\desktop\\\\ranu1.txt");
			             FileOutputStream writecopy = new FileOutputStream("C:\\\\Users\\\\HP\\\\desktop\\\\t2.txt")) {
	                     int i;
			            while ((i = read.read()) != -1) {
			                writecopy.write(i);
			            }
			          System.out.println("Data copied successfully");
			        } catch (IOException e) {
			          System.out.println("Exception handled: " + e);
		        }
	}

}
