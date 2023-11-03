class Man
{
	private int mobno;
	private String name;
	static String city= "Kolhapur";
	public static void change()
	{
		city="Mumbai";
	}
	public Man(int mno,String nm)
	{
		mobno=mno;
		name=nm;
	}
	public void showdata()
	{
		System.out.println("mobno is "+mobno);
		System.out.println("name is "+name);
		System.out.println("city is "+city);
	}
}
class Stest
{
	public static void main(String[]args)
	{
		Man.change();
		Man M1=new Man(1234,"raksha");
		M1.showdata();
		Man M2=new Man(0123,"sakshi");
		M2.showdata();
	}
}