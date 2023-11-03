import java.util.*;
class Atest
{
	public static void main(String [] args)
	{
		ArrayList<String>L1=new ArrayList<String>();
		L1.add("samiksha");
		L1.add("heeba");
		System.out.println(L1);
		ArrayList<String>L2=new ArrayList<String>();
		L2.add("revti");
		L2.add("gouri");
		L2.add("depali");
		System.out.println(L2);
		L1.addAll(L2);
		System.out.println(L1);	
		System.out.println(L1.size());
		System.out.println(L1.get(3));
		System.out.println(L1);
		Collections.sort(L1);
		System.out.println("sorted list is "+L1);
		ArrayList<String>nko=new ArrayList<String>();
		nko.add("samiksha");
		nko.add("revti");
		nko.add("depali");
		L1.removeAll(nko);
		System.out.println(L1);
		System.out.println(L1.isEmpty());
		L1.set(1,"Samin");
		System.out.println(L1);
		L1.clear();
		System.out.println(L1);
		
		
	}
}