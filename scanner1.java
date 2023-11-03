import java.util.*;
class abc
{
	public static void main(String [] args)
	{
		System.out.println("bhava info enter kar");
		Scanner in=new Scanner(System.in);
		System.out.println("enter name plz");
		String name=in.next();
		System.out.println("enter age");
		int a=in.nextInt();
		System.out.println("enter percentage");
		double per=in.nextDouble();
		System.out.println("name is "+name);
		System.out.println("age is "+a);
		System.out.println("per is "+per);
		in.close();
	}
}