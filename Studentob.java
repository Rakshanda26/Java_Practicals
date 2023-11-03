class Student
{
	private int rollno;
	private String name;
	private String city;
	private String clgname;
	
	public void setdata(int rn,String nm,String cty,String cnm)
	{
		rollno=rn;
		name=nm;
		city=cty;
		clgname=cnm;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("roll no is "+rollno);
		System.out.println("city is "+city);
		System.out.println("clgname is "+clgname);
	}

}
class EZtest
{
public static void main(String [] args)
{
	Student S1=new Student();
	S1.setdata(10,"ss","kol","kit");
	S1.showdata();
	
	Student S2=new Student();
	S2.setdata(11,"ff","kol","sgi");
	S2.showdata();
}	
}





