package Thread;

import java.io.File;

public class RenameFile {

public static void main(String[] args) {
	    File originalname=new File("C:\\Users\\HP\\desktop\\t1.txt");
        File rename=new File("C:\\Users\\HP\\desktop\\t2.txt");
      
      if(originalname.exists())
{
   System.out.println(originalname.renameTo(rename)+" successfully changed name ");

}
else {
   System.out.println("File doest not exits");
}

  }
}


