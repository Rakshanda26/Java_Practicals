class SB
{
	public static void main(String [] args)
	{
		StringBuilder S1=new StringBuilder("pizzaa");
		System.out.println(S1);
		S1.append(" fries");
		System.out.println(S1);
		S1.insert(6," and");
		System.out.println(S1);
		S1.replace(6,10," roll");
		System.out.println(S1);
		S1.delete(6,11);
		System.out.println(S1);
		S1.reverse();
		System.out.println(S1);
	}
}