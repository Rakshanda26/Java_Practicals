class Person
{
	private String name;
	private String city;
	
	public void setdata(String nm,String ct)
	{
		name=nm;
		city=ct;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
	}
}
class Student extends Person
{
	private int rollno;
	private String branch;
	private String clgname;
	
	public void setdata(String nm,String ct,int rn,String br,String cnm)
	{
		super.setdata(nm,ct);
		rollno=rn;
		branch=br;
		clgname=cnm;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("rollno is "+rollno);
		System.out.println("branch is "+branch);
		System.out.println("clgname is "+clgname);
		
	}
}
class Htest
{
	public static void main(String [] args)
	{
		Student S1=new Student();
		S1.setdata("Raksha","kol",20,"etc","kit");
		S1.showdata();
		
		Student S2=new Student();
		S2.setdata("RAJ","kol",30,"civil","gpk");
		S2.showdata();
		
	
	}
}

