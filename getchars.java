class Status
{
	public static void main(String [] args)
	{
		String S1=new String("I love pizza and sandwithch");
		char[]ch=new char[5];
		S1.getChars(17,26,ch,0);
		System.out.println("ch content :" );
		for(char temp:ch)
		{
			System.out.print(temp);
		}
		
	}
}