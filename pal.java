class Pal
{
	public static void main(String [] args)
	{
		int n=101;
		int temp=n;
		int rev=0;
		int rem;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("no is palindrome");
		}
	}

	
}