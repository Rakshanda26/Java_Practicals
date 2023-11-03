class Arm
{
	public static void main(String [] args)
	{
		int n=153;
		int rem,sum=0,temp;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
		
	}
}