class Student
{
	private int rollno;
	private String name;
	static String Collagename=" KIT ";
	
	public Student(int rn,String nm)
	{
		rollno=rn;
		name=nm;
	}
	public void showdata()
	{
		System.out.println("roll no is "+rollno);
		System.out.println("name is "+name);
		System.out.println("Collage name is "+Collagename);
	}
}

class Stest
{
	public static void main(String [] args)
	{
		Student S1=new Student(17,"RAKSHA");
		S1.showdata();
		
		Student S2=new Student(44,"Raj");
		S2.showdata();
	}
}