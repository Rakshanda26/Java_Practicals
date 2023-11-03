class Ptest
{
	public static void main(String [] args)
	{
		String S="raksha";
		String r="";
		int length=S.length()-1;
		for(int i=length-1;i>=0;i--)
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