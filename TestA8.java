class SB
{
	public static void main(String [] args)
	{
		StringBuffer S1=new StringBuffer("maggi");
		System.out.println(S1);
		S1.append("pizza");
		System.out.println(S1);
		S1.insert(5,"and");
		System.out.println(S1);
		S1.delete(5,8);
		System.out.println(S1);
		S1.reverse();
		System.out.println(S1);
	}
}