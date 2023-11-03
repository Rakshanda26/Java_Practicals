import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		ArrayDeque<String>A1=new ArrayDeque<String>();
		A1.add("rutvik");
		A1.add("kunal");
		A1.add("manthan");
		System.out.println("list in queue is"+A1);
		A1.offerFirst("omkar");
		System.out.println("bhavachya raga ntr list "+A1);
		A1.pollLast();
		System.out.println("After bhandna list is "+A1);
		A1.offer("ayaan");
		System.out.println("list is "+A1);
		A1.poll();
		System.out.println("list is "+A1); 
		A1.remove();
		System.out.println("list is "+A1);
		System.out.println("head element "+A1.element());
		System.out.println("head element "+A1.peek());
	}
}