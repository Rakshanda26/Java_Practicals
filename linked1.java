import java.util.*;
class Ltest
{
	public static void main(String [] args)
	{
		LinkedList<String>L1=new LinkedList<String>();
		L1.add("revti");
		L1.add("depali");
		System.out.println("list is "+L1);
		L1.addFirst("Gouri");
		System.out.println("List is "+L1);
		L1.addLast("Gouri");
		System.out.println("list is "+L1);
		L1.add(1,"Gouri");
		System.out.println(L1);
		L1.removeLastOccurrence("Gouri");
		System.out.println(L1);
		L1.removeFirstOccurrence("Gouri");
		System.out.println(L1);
		L1.removeFirst();
		System.out.println(L1);
		L1.removeLast();
		System.out.println(L1);
		L1.add("aboli");
		L1.add("vrushali");
		L1.add("radhika");
		System.out.println("list of pratik is"+L1);
		Iterator i=L1.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}