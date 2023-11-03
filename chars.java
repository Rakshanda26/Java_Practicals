class Chars
{
	public static void main(String [] args)
	{
		String S="HI How are you";
		char[]c=new char[15];
		S.getChars(11,14,c,0);
		System.out.println(c);
	}
}