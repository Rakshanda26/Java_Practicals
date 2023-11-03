import javax.swing.*;
class Bank
{
public static void main(String[]args)
{
String age=JOptionPane.showInputDialog("Enter the age");
	int a=Integer.parseInt(age);
System.out.println("age is "+age);
	if(a>=18)
	{
		System.out.print("eligible");
	if(a==25)
	{
		System.out.print("eligible for exam");
	}
	}
	else
	{ 
	System.out.print("not eligible");
	}
}
}