class MH09
{
	private String name;
	private int mobno;
	static String city="Kolhapur ";
	
	public MH09(String nm,int mn)
	{
		name=nm;
		mobno=mn;
	}
	
	public void showdata()
	{
	System.out.println("name is "+name);
	System.out.println("mobile no is "+mobno);
	System.out.println("city is "+city);
	}	
}
class Ptest
{
	public static void main(String[]args)
	{
		MH09 P1=new MH09("RAJ",3456);
		P1.showdata();
		
		MH09 P2=new MH09("Raksha",2378);
		P2.showdata();
	}
	
}
