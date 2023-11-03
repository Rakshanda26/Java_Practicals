class Status
{
	public static void main(String[] args)
	{
		//String S="Kolhapur";
		String S1=new String("Kolhapur");
		String S2=S1.intern();
		String S3=S.intern();
		System.out.println(S==S1);
		System.out.println(S==S2);
		System.out.println(S==S3);
	}
}