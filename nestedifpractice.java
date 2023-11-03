import javax.swing.*;
class Result
{
public static void main(String[]args)
{
	int p=90,c=89,b=48;
String name=JOptionPane.showInputDialog("Enter the name");
System.out.println("name is "+name);
	if(p>=40&&c>=40&&b>=40)
	{
	int total=p+c+b;
	double per=total/3;
	System.out.println("Student is pass");
	if(per>=60)
	{
	System.out.println("Student is pass with first class");
	}
	}
	else
	{
	System.out.println("Student is fail");
	}
}
}