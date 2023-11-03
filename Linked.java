import java.util.*;
class Ltest
{
	public static void main(String [] args)
	{
		LinkedList<String>L1=new LinkedList<String>();
		L1.add("revti");
		L1.add("gouri");
		L1.add("depali");
		System.out.println("list is "+L1);
		LinkedList<String>L2=new LinkedList<String>();
		L2.add("heba");
		L2.add("piya");
		L1.addAll(L2);
		System.out.println("Adding some element"+L1);
		Collections.sort(L1);
		System.out.println("Sorted list"+L1);
		System.out.println("is aakash single "+L1.isEmpty());
		System.out.println(L1.size());
		System.out.println(L1.get(4));
		L1.set(3,"Rajesh");
		System.out.println("updated list is "+L1);
		LinkedList<String>nko=new LinkedList<String>();
		nko.add("revti");
		nko.add("depali");
		L1.removeAll(nko);
		System.out.println(L1);
		L1.remove("Rajesh");
		System.out.println(L1);
		L1.clear();
		System.out.println(L1);
		System.out.println("is aakash single "+L1.isEmpty());
		
	}
}