class Ptest
{
	public static void main(String [] args)
	{
		String n="Rakshanda is so happy";
		System.out.println(n);
		System.out.println("length of String is "+n.length());
		char[]c=n.toCharArray();
		int l=c.length;
		System.out.println("length of array "+l);
		System.out.println("element in array");
		for(int i=0;i<l;i++)
		{
			System.out.println(c[i]);
		}
	}
}