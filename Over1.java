class Stest
{
	public void Sum(int x, int y)
	{
		int S=x+y;
		System.out.println("Addition is "+S);
	}
	public void Sum(int x,int y,int z)
	{
		int S=x+y+z;
		System.out.println("Addition is "+S);
	}
}
class Test
{
	public static void main(String [] args)
	{
	Stest S1=new Stest();
	S1.Sum(5,10);
	S1.Sum(5,10,20);
	}
}