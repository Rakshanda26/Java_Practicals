class Student
{
private int Rollno;
private String name;
private String collegename;
private String city;

public void setdata(int rn,String nm,String cnm,String ct)
{
	Rollno=rn;
	name=nm;
	collegename=cnm;
	city=ct;
}
public void showdata()
{
System.out.println("Roll no is "+Rollno);
System.out.println("name is "+name);
System.out.println("college name is "+collegename);
System.out.println("city is "+city);
}
}
class Stest
{
public static void main(String[]args)
{
Student S1;
S1 = new Student();
S1.setdata(101," raksha ", " kit "," kolhapur");
S1.showdata();

Student S2;
S2 = new Student();
S2.setdata(102," suraj " , "kit","kolhapur");
S2.showdata();
}
}