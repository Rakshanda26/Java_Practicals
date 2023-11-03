class Stest
{
	public static void main(String [] args)
	{
		String S1="Jupiter";
		String S2=new String("Jupiter");
		String S3="Access";
		String S4=new String("Access");
		String S5="Jupiter";
		System.out.println(S1.equals (S2));
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals (S4));
		System.out.println(S1.equals(S5));
		System.out.println(S1==S2);
		System.out.println(S1==S3);
		System.out.println(S1==S4);
		System.out.println(S1==S5);
		System.out.println(S1.compareTo(S2));
		System.out.println(S1.compareTo(S3));
		System.out.println(S1.compareTo(S4));
		System.out.println(S1.compareTo(S5));
	}
}