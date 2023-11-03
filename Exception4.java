class Ftest
{
	public static void main(String [] args)
	{
		try
		{
			int n=10/0;
			System.out.println(n);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		finally
		{
			System.out.println("Hey i will execute alawys");
		}
		System.out.println("I am rest of programs");
	}
}