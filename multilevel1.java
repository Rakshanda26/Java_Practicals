import javax.swing.*;
class Person
{
	protected String name;
	protected String city;
	
	public void setdata()
	{
		name=JOptionPane.showInputDialog("Enter the name ");
		city=JOptionPane.showInputDialog("Enter the city");
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
	
	public void setdata()
	{
		super.setdata();
		String ei=JOptionPane.showInputDialog("Enter the emplouy id");
			empid=Integer.parseInt(ei);
		job =JOptionPane.showInputDialog("Enter the job");
		String s=JOptionPane.showInputDialog("Enter the salary");
			sal=Integer.parseInt(s);
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Employ id is "+empid);
		System.out.println("job is "+job);
		System.out.println("salary is "+sal);
	}
}
class Manager extends Employ
{
	private int Deptno;
	private String Deptnm;
	private int comm;
	
	public void setdata()
	{
		super.setdata();
		String dno=JOptionPane.showInputDialog("enter the deptno is ");
			Deptno=Integer.parseInt(dno);
		Deptnm=JOptionPane.showInputDialog("Enter the department name");
		String cm=JOptionPane.showInputDialog("enter the commission");
			comm=Integer.parseInt(cm);
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
		M1.setdata();
		M1.showdata();
	}
}










