class Bytes
{
	public static void main(String [] args)
	{
		String S="Rakshanda";
		System.out.println(S);
		byte [] b=S.getBytes();
		int l=b.length;
		System.out.println("length of array is "+l);
		System.out.println("Bytes in array");
		for(int i=0;i<l;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}