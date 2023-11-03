class Status
{
	public static void main(String [] args)
	{
			int i=0;
		String S="Arpita is ex life";
		String [] w=S.split("\\s");
			for(String S1:w)
			{
				System.out.println(S1);
				i++;
			}
			System.out.println("no of word in string "+i);
	}
}