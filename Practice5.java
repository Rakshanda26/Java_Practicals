import javax.swing.*;
class License
{
public static void main(String[]args)
{
String cname=JOptionPane.showInputDialog("Enter the candidate name");
String age=JOptionPane.showInputDialog("Enter the age");
	int a=Integer.parseInt(age);
System.out.println("Enter the name "+cname+"Enter the age"+a);
	if(a>18&&a<90)
	{
	System.out.println("candidate is eligible for license");
	}
	else
	{
	System.out.println("not eligible");
	}
}
}