import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		LinkedHashSet<String>L1=new LinkedHashSet<String>();
		L1.add("kajal");
		L1.add("kirti");
		L1.add("Ananya");
		L1.add("kirti");
		System.out.println("List is "+L1);
		LinkedHashSet<String>L2=new LinkedHashSet<String>();
		L2.add("sara");
		L2.add("arohi");
		L1.addAll(L2);
		System.out.println("new list is "+L1);
		System.out.println(L1.size());
		System.out.println(L1.isEmpty());
		L1.remove("Ananya");
		System.out.println(L1);
		L1.removeIf(Str->Str.contains("kajal"));
	    System.out.println("Element list is "+L1);
		L1.clear();
		System.out.println(L1);
	}
}