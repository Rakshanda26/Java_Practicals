import javax.swing.*;
class Marks
{
public static void main(String[]args)
{
String Name=JOptionPane.showInputDialog("Enter the name ");
String Mark1=JOptionPane.showInputDialog("Enter the marks for physics");
	int m1=Integer.parseInt(Mark1);
String Mark2=JOptionPane.showInputDialog("Enter the marks for chemistry ");
	int m2=Integer.parseInt(Mark2);
String Mark3=JOptionPane.showInputDialog("Enter the marks for maths");
	int m3=Integer.parseInt(Mark3);
String Mark4=JOptionPane.showInputDialog("Enter the marks for biology");
	int m4=Integer.parseInt(Mark4);
String Mark5=JOptionPane.showInputDialog("Enter the marks for electronics");
	int m5=Integer.parseInt(Mark5);
    int total=m1+m2+m3+m4+m5;
	double per=total/5;
System.out.println("total is "+total);
System.out.println("percentage is "+per);
	if(per>=75)
	{
	System.out.println("pass with distinction");
	}
	else if(per>=60)
	{
	System.out.println("pass with first class");
	}
	else if(per>=50)
	{
	System.out.println("pass with second class");
	}
	else if(per>=40)
	{
	System.out.println("pass");
	}
	else
	{
	System.out.println("fail");
	}
}
}