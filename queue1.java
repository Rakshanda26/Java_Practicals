import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
	PriorityQueue<String>q1=new PriorityQueue<String>();
		q1.add("manish");
		q1.add("ayaan");
		q1.add("vishal");
		q1.add("pratik");
		System.out.println("element in the queue "+q1);
		System.out.println("head element "+q1.element());
		System.out.println("head element "+q1.peek());
		q1.poll();
		System.out.println("after poll list is "+q1);
		q1.remove();
		System.out.println("After remove list is "+q1);
		q1.offer("mahesh");
		System.out.println("After offer list is "+q1);
	}
}