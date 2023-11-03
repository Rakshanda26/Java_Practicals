class Student
{
	private String name;	
	private String city;
	static String univercity="ShivajiUnivercity";
	
	public void setdata(String nm,String ct)
	{
		name=nm;
		city=ct;
	}
	public void showdata()
	{
		System.out.println("Name is "+name);
		System.out.println("City is "+city);
		System.out.println("Univercity is "+univercity);
	}
}
class Stest
{
	public static void main(String [] args )
	{
		Student S1=new Student();
		S1.setdata("raksha","kolhapur");
		S1.showdata();
		
		Student S2=new Student();
		S1.setdata("Raj","kolhapur");
		S1.showdata();
	}
}