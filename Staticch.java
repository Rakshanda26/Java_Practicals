class Employ
{
	private int empid;
	private String name;
	static String city="Kolhapur";
	static String Cname="slk";
	
	public static void change()
	{
		city="pune";
	}
	public Employ(int ei,String nm)
	{
		empid=ei;
		name=nm;
	}
	public void showdata()
	{
		System.out.println("empid is "+empid);
		System.out.println("name is "+name);
		System.out.println("city is "+city);
		System.out.println("Company name is "+Cname);
	}
}
class Etest
{
	public static void main(String[]args)
	{
		Employ.change();
		Employ E1=new Employ(11,"Raksha");
		E1.showdata();
		
		Employ E2=new Employ(10,"raj");
		E2.showdata();
	}
}
