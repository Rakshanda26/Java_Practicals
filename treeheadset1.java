import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		TreeSet<String>L1=new TreeSet<String>();
		L1.add("A");
		L1.add("B");
		L1.add("C");
		L1.add("D");
		L1.add("E");
	    System.out.println("Give set is "+L1);
		System.out.println("Given set in descending "+L1.descendingSet());
		System.out.println("Head set of c"+L1.headSet("c",false));
		System.out.println("subset"+L1.subset("A",false,"D",true));
		System.out.println("tailset"+L1.tailset("C",false));
	}
}   