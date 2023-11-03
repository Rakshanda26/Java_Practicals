import javax.swing.*;
class Result
{
public static void main(String[]args)
{
String Name=JOptionPane.showInputDialog("Enter the name ");
String Mark1=JOptionPane.showInputDialog("Enter the marks for physics");
	int m1=Integer.parseInt(Mark1);
String Mark2=JOptionPane.showInputDialog("Enter the marks for chemistry");
	int m2=Integer.parseInt(Mark2);
String Mark3=JOptionPane.showInputDialog("Enter the marks for biology");
	int m3=Integer.parseInt(Mark3);
String Mark4=JOptionPane.showInputDialog("Enter the marks for maths ");
	int m4=Integer.parseInt(Mark4);
String Mark5=JOptionPane.showInputDialog("Enter the marks for electronics");
	int m5=Integer.parseInt(Mark5);
	if(m1>=40&&m2>=40&&m3>=40&&m4>=40&&m5>=40)
	{
	int total=m1+m2+m3+m4+m5;
	int per=total/5;
	System.out.print("Student is pass");
	if(per>=60)
	{
	System.out.print(" with first class");
	}
	}
	else
	{
	System.out.println(" student is fail");
	}
}
}