import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		Vector <String>V1=new Vector<String>();
		V1.add("nital");
		V1.add("raksha");
		V1.add("raj");
		System.out.println("list in the vector"+V1); 
		System.out.println("Size of vector is "+V1.size());
		System.out.println("Capacity of vector "+V1.capacity());
		System.out.println("First element in vector"+V1.firstElement());
		System.out.println("Last element in vector"+V1.lastElement());
		System.out.println("Remove element at index 2"+V1.remove(2));
		System.out.println("After remove method vector is "+V1);
	}
	
}