class Student
{
	private String name;
	private int rollno;
	static String collagename="sgi";
	
	public static void change()
	{
		collagename="coep";
	}
	
	public Student(String nm,int rn)
	{
		name=nm;
		rollno=rn;
	}
	
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("rollno is "+rollno);
		System.out.println("collagename is "+collagename);
	}
}
class Stest
{
	public static void main(String[]args)
	{
		Student.change();
		
		Student S1=new Student("Raksha",10);
		S1.showdata();
		
		Student S2=new Student("raj",12);
		S2.showdata();
	}
}