class Value
{
	public static void main(String [] args)
	{
		int i=10;
		System.out.println(String.valueOf(i));
		
		String n="22";
		System.out.println(String.valueOf(n));
		
		double d=2.5;
		System.out.println(String.valueOf(d));
		
		Boolean B=true;
		System.out.println(String.valueOf(B));
		
		String b="true";
		System.out.println(String.valueOf(b));
		
		char c='R';
		System.out.println(String.valueOf(c));
		
		String S='A';                                      //char cannot be converted to string
		System.out.println(String.valueOf(S));   
	}
	
	
}