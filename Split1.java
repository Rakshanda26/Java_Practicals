class Status
{
	public static void main(String [] args)
	{
		int i=0;
		String S1="i love suraj";
		String [] w=S1.split("\\s");
			for(String S2:w)
			{
				System.out.println(S2);
				i++;
			}
			System.out.println("no of words in String are "+i);
	}
}