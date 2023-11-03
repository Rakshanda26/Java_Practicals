class Ztest
{
	public static void main(String [] args)
	{
		String s="lol";
		String r="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r))
		{
			System.out.println("String is palindrome");
		}
	}
}