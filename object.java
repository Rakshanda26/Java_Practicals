class Student
{
private int Rollno;
private String name;
private String city;
private String collegename;
public void setdata (int rn,String nm,String ct, String cnm)
{
	Rollno=rn;
	name=nm;
	city=ct;
	collegename=cnm;
}
public void showdata()
{
System.out.println("Rollno is"+Rollno);
System.out.println("name is"+name);
System.out.println("city is"+city);
System.out.println("college is"+collegename);
}
}
class Stest
{
public static void main(String[] args)
{
	Student S1;
	S1=new Student();
	S1.setdata(101,"Rakshanda","Kolhapur","kit");
	S1.showdata();
	
	Student S2;
	S2=new Student();
	S2.setdata(102,"nital","kolhapur","Dot");
	S2.showdata();
	
}
}

