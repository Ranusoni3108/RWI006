package Collectiondemo;
import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistIterator 
{
public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add("deepak");
		al1.add(40);
		al1.add(90);
		al1.add(50);
//System.out.println(al1);
Iterator itr= al1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
