class Stest
{
public void sum(int x,int y)
{
	int s=x+y;
	System.out.println("Addition is "+s);
}
public void sum(int x,int y,int z)
{
	int s=x+y+z;
	System.out.println("Addition is "+s);
}
}
class Test
{
	public static void main(String [] args)
	{
		Stest S1=new Stest();
		S1.sum(20,30);
		S1.sum(20,30,40);
	}
}