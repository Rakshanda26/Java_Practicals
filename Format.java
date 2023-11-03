class Format
{
	public static void main(String [] args)
	{
		String S1="Rakshanda";
		String S2=String.format("%s",S1);
		System.out.println(S2);
		
		//int n=10;
		String S=String.format("%d",46);
		System.out.println(S);
		
		//double d=4.5;
		String S3=String.format("%f",4.5);
		System.out.println(S3);
		
		//char c='S';
		String S4=String.format("%c",'s');
		System.out.println(S4);
		
		String S5=String.format("%x",101);
		System.out.println(S5);
		
	}
}