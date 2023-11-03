import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		Stack <String>S1=new Stack<String>();
		S1.push("Aboli");
		S1.push("radhika");
		S1.push("vrushali");
		System.out.println("Bhavachi stack list "+S1);
		System.out.println("peek element in list "+S1.peek());
		S1.pop();
		System.out.println("After pop list is "+S1);
		System.out.println("is pratik empty"+S1.isEmpty());
		int loc=S1.search("Aboli");
		System.out.println("location of aboli"+loc);
	}
}