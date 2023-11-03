import java.util.*;
class Student
{
    String name,clgname,branch;
	int rollno;
	public Student(String nm,String cnm,String br,int rno)
	{
		this.name=nm;
		this.clgname=cnm;
		this.branch=br;
		this.rollno=rno;
	}
}
	class Ltest
	{
		public static void main(String [] args)
		{
		LinkedList<Student>L1=new LinkedList<Student>();
		Student raj=new Student("raj","gpk","civil",26);
		Student nital=new Student("nital","kit","etc",23);
		
		L1.add(raj);
		L1.add(nital);
		for(Student L:L1)
		{
			System.out.println(L.name+" "+L.clgname+" "+L.branch+" "+L.rollno+" ");
		}
		}
	}