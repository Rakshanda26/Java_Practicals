class SBL
{
	public static void main(String [] args )
	{
	StringBuffer S1=new StringBuffer("");
	System.out.println(S1);
	System.out.println(S1.capacity());

	S1.append("Hello");
	System.out.println(S1);
	System.out.println(S1.capacity());
	
	S1.append(" Feb is my favourite month");
	System.out.println(S1);
	System.out.println(S1.capacity());
	}
}