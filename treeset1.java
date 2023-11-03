import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		TreeSet<String>L1=new TreeSet<String>();
		L1.add("kajal");
		L1.add("kirti");
		L1.add("Ananya");
		Iterator itr=L1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}   