class Etest
{
	public static void main(String [] args)
	{
		try
		{
			int n=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("I am remaining code");
		System.out.println("Is it impact exception on me");
	}
}