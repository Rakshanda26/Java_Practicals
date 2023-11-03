class Char
{
	public static void main(String [] args)
	{
		String S="vishal";
		String r="";
		int len=S.length();
		for(int i=len-1;i>=0;i--)
		{
			r=r+S.charAt(i);
		}
		if(S.equals(r))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
}
