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
		System.out.println("name is "+name);
		System.out.println("city is "+city);
	}
}
class Employ extends Person
{
	private int empid;
	private String job;
	private int sal;
	
	public void setdata(String nm,String ct,int ei,String j,int s)
	{
		super.setdata(nm,ct);
		empid=ei;
		job=j;
		sal=s;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("empid is "+empid);
		System.out.println("job is "+job);
		System.out.println("sal is "+sal);
	}
}
class Manager extends Employ
{
	private int Deptno;
	private String Deptnm;
	private int comm;
	
	public void setdata(String nm,String ct,int ei,String j,int s,int dno,String dnm,int cm)
	{
		super.setdata(nm,ct,ei,j,s);
		Deptno=dno;
		Deptnm=dnm;
		comm=cm;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Deptno is "+Deptno);
		System.out.println("Deptnm is "+Deptnm);
		System.out.println("comm is "+comm);
	}
}
class Htest
{
	public static void main(String[]args)
	{
	   Manager M1=new Manager();
	   M1.setdata("raksha","kolhapur",11,"projman",1000,1001,"software",1000);
	   M1.showdata();
	}
}














