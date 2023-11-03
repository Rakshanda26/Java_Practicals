class Replace
{
	public static void main(String [] args)
	{
		String S1=(" I like puma brands ");
		//String S2=S1.replace("like ","hate ");
		String S2=S1.replaceAll("I","i");
		System.out.println(S2);
	}
}