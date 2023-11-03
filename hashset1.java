import java.util.*;
class Atest
{
	public static void main(String [] args)
	{
	HashSet<String>A1=new HashSet<String>();
	A1.add("Gouri");
	A1.add("Revti");
	A1.add("Depali");
	System.out.println("element of Akash"+A1);
	A1.add("Gouri");
	System.out.println("After adding one Gouri list is "+A1);
	System.out.println(A1.size());
	A1.set(2,"samin");
	System.out.println("updated list is "+A1);
	A1.remove("Revti");
	System.out.println("list:"+A1);
	A1.removeIf(Str->Str.contains("Gouri"));
	System.out.println("Element list is "+A1);
	}
}