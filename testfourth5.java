import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		LinkedHashSet<String>L1=new LinkedHashSet<String>();
		L1.add("nital");
		L1.add("raj");
		L1.add("raksha");
		L1.add("rutvik");
		System.out.println("List is "+L1);
		LinkedHashSet<String>L2=new LinkedHashSet<String>();
		L2.add("aakash");
		L2.add("pratik");
		L1.addAll(L2);
		System.out.println("new list is "+L1);
		System.out.println(L1.size());
		System.out.println(L1.isEmpty());
		L1.remove("Ananya");
		System.out.println(L1);
		L1.clear();
		System.out.println(L1);
	}
}   