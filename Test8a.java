class Factorial
{
	public static void main(String [] args )
	{
		int i=1,Fact=1;
		while(i<=5)
		{
			Fact=Fact*i;
			i++;
		}
		System.out.println("Factorial of the no is "+Fact);
	}
}