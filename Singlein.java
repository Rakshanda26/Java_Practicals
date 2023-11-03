class Person
{
	protected String name;
	protected String city;
public void setdata(String nm,String ct)
{
	name=nm;
	city=ct;
}
public void showdata()
{
	System.out.println("Enter the name "+name);
	System.out.println("Enter the city "+city);
}
}
class Student extends Person
{
	private int rollno;
	private String branch;
	private String clgname;
	
	public void setdata(String nm,String ct, int rn,String br,String cnm)
	{
	    super.setdata(nm,ct);
		rollno=rn;
		branch=br;
		clgname=cnm;
	}
	public void showdata()
	{
	super.showdata();
	System.out.println("Enter the roll no "+rollno);
	System.out.println("Enter the branch "+branch);
	System.out.println("Enter the college name "+clgname);
	
	}
}

class Htest
{
public static void main(String [] args)
{
	Student S1=new Student();
	S1.setdata("RAJ","kolhapur",10,"civil","gpk");
	S1.showdata();
	
	Student S2=new Student();
	S2.setdata("raksha","kol",12,"etc","kit");
	S2.showdata();
}
}







