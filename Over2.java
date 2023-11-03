class Stest
{
	public void sum(int x,int y)
	{
		int S=x+y;
		System.out.println("Addition is "+S);
	}
	public void sum(double x,double y,double z)
	{
		double S=x+y+z;
		System.out.println("Addition is "+S);
	}
}
class Test
{
	public static void main(String [] args)
	{
		Stest S1=new Stest();
		S1.sum(20,30);
		S1.sum(20,40,50);
	}
}