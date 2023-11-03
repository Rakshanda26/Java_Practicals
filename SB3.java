class SB
{
	public static void main(String [] args)
	{
		StringBuffer S1=new StringBuffer("Aakash");
		System.out.println(S1);
		S1.append("Gouri");
		System.out.println(S1);
		S1.insert(6,"like");
		System.out.println(S1);
		System.out.println("After gavaskar");
		S1.replace(6,10,"weds");
		System.out.println(S1);
		System.out.println("After some discussion how to live");
		S1.delete(6,10);
		System.out.println(S1);
		System.out.println("Some tp there");
		S1.reverse();
		System.out.println(S1);
	}
}