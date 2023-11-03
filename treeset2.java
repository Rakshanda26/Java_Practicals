import java.util.*;
class Ptest
{
	public static void main(String [] args)
	{
		TreeSet<Integer>L1=new TreeSet<Integer>();
		L1.add(44);
		L1.add(14);
		L1.add(94);
		System.out.println("Higher value is "+L1.pollLast());
		System.out.println("lowest value is "+L1.pollFirst());
	}
}   