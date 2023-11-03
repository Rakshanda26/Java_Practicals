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

class Employ extends Person
{
	private int empid;
	private String job;
	private int salary;
	
	public void setdata(String nm,String ct,int ei,String jo,int sal)
	{
		super.setdata(nm,ct);
		empid=ei;
		job=jo;
		salary=sal;
	}
	
	public void showdata()
	{
		super.showdata();
		System.out.println("Empid is "+empid);
		System.out.println("job is "+job);
		System.out.println("salary is "+salary);
	}
}
class Manager extends Employ
{
	private int Deptno;
	private String Deptnm;
	private int comm;
	
	public void setdata(String nm,String ct,int ei,String jo,int sal,int Dno,String Dnm,int cm)
	{
		super.setdata(nm,ct,ei,jo,sal);
		Deptno=Dno;
		Deptnm=Dnm;
		comm=cm;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("department number  is "+Deptno);
		System.out.println("department name is "+Deptnm);
		System.out.println("commision is "+comm);
	}
}

class Mtest
{
public static void main(String[]args)
{
	Manager M1=new Manager();
	M1.setdata("raksha","kol",10,"project manager",2200,1001,"software",5000);
	M1.showdata();
}
}

















