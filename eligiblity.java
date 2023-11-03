import javax.swing.*;
class Bank
{
public static void main(String[]args)
{
String name=JOptionPane.showInputDialog("Enter name");
String age=JOptionPane.showInputDialog("Enter age");
	int a=Integer.parseInt(age);
	if(a>21&&a<30)
	{
	System.out.println("candidate name is"+name + "you are eligible for bank exam "+"age is "+age);
	
	}
	else
	{
	System.out.println("candidate name" +name + "you are not eligible for bank exam");
	}
}
}