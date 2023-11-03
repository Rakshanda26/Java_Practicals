import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		Vector <String>V1=new Vector<String>();
		V1.add("Dsp");
		V1.add("Ayaan");
		V1.add("Gous");
		System.out.println("list in the vector"+V1); 
		V1.addElement("Pratik");
		V1.addElement("Akash");
		System.out.println("After addElement Method "+V1);
		System.out.println("Size of vector is "+V1.size());
		System.out.println("Capacity of vector "+V1.capacity());
		if(V1.contains("Gous"))
		{
			System.out.println("this element present at the indexOf "+V1.indexOf("Gous"));
		}
		else
		{
			System.out.println("no such element found");
		}
		System.out.println("First element in vector"+V1.firstElement());
		System.out.println("Last element in vector"+V1.lastElement());
		System.out.println("Remove element at index 3"+V1.remove(3));
		System.out.println("After remove method vector is "+V1);
		V1.removeElementAt(2);
		System.out.println("remove at index 2 list is "+V1);
		System.out.println("Hash code of vector "+V1.hashCode());
		System.out.println("Element at index 1"+V1.get(1));
	}
	
}