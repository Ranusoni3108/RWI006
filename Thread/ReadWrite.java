package Thread;

import java.io.File;
import java.io.IOException;

public class ReadWrite {

	private static final File Ranu = null;
	private static final File Ranu_Rename = null;

	public static void main(String[] args) {
		File Shubham = new File("C:\\Users\\HP\\desktop\\Ranu");
        File ShubhamRename = new File("C:\\Users\\HP\\desktop\\Ranu Soni");
        try {
            if (Shubham.createNewFile()) {
                System.out.println("File is saved");
            } else {
                System.out.println("File is already saved");
            }
            if (Ranu.exists()) {
                // System.out.println("File Name =" +Ranu.getName());
                // System.out.println("File Name =" + Ranu.length());
                System.out.println(Ranu.renameTo(Ranu_Rename) + "File is now renamed");
            } else {
                System.out.println("File does not exist");
            }  } 
        catch (IOException i) {
                System.out.println("Exception is handaled.");
            }

        }

    

	}


