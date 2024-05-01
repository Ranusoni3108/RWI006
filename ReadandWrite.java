import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class test
{

void readFile() throws FileNotFoundException
{
	FileInputStream fis=new FileInputStream("d:/abc.txt");
}
void savefile() throws FileNotFoundException 
{
	String text="this is demo";
	FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
}
}
class ReadandWrite
{
	public static void main(String args[]) 
	{
		
		test rw=new test();
		try
		{
			rw.readFile();
			
		}
		catch(FileNotFoundException e)
		
		{
			e.printStackTrace();
		}
		try
		{
			rw.savefile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
			System.out.println("hello");
			}
		
	}



