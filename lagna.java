import java.util.*;
class Lagn
{
    String nm,edu;
	int balance,age;
	public Lagn(String nm,String edu,int balance,int age)
	{
		this.nm=nm;
		this.edu=edu;
		this.balance=balance;
		this.age=age;
	}
}
	class Ltest
	{
		public static void main(String [] args)
		{
		LinkedList<Lagn>L1=new LinkedList<Lagn>();
		Lagn sejal=new Lagn("sejal","be",50,26);
		Lagn aarti=new Lagn("aarti","be",50,26);
		
		L1.add(sejal);
		L1.add(aarti);
		for(Lagn L:L1)
		{
			System.out.println(L.nm+" "+L.edu+" "+L.balance+" "+L.age+" ");
		}
		}
	}