class Swap
{
public static void main(String[]args)
{
	int a=10,b=20;
	System.out.println("before swapping a is"+a);
	System.out.println("before swapping b is"+b);
	int temp=a;
	a=b;
	b=a;
	System.out.println("after swapping a is"+a);
	System.out.println("after swapping b is"+b);
}
}