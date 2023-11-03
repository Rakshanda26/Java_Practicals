class ptest
{
	public static void main(String [] args)
	{
		String S="rakshanda is so happyy";
		int c=0;
		for(int i=0;i<=S.length()-1;i++)
		{
			if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
			{
				System.out.print(S.charAt(i));
				c++;
			}
			System.out.println(" no vowels in string is "+c);
		}
		
		
	}
}
/*class Ptest
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
}*/