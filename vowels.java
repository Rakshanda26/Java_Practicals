class Ptest
{
	public static void main(String [] args)
	{
		String n="my name is rakshanda";
		int c=0;
		for(int i=1;i<=n.length()-1;i++)
		{
			if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
			{
				System.out.println(n.charAt(i));
				c++;
			}
			System.out.println("no of vowels in String "+c);
		}
	}
}