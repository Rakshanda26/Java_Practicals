class Student
{
	String nm;
	int Rn;
	public Student(String name,int Rollno)
	{
		nm=name;
		Rn=Rollno;
	}
	public void showdata()
	{
		System.out.println("name is "+nm);
		System.out.println("Rollno is "+Rn);
		
	}
}
class Test
{
	public static void main(String [] args )
	{
		Student S1=new Student("raksha",12);
		S1.showdata();
	}
}