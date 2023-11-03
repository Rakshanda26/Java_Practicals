import javax.swing.*;
class Number
{
public static void main(String[]args)
{
String num1=JOptionPane.showInputDialog("Enter number 1");
	int a=Integer.parseInt(num1);
String num2=JOptionPane.showInputDialog("Enter number 2");
	int b=Integer.parseInt(num2);
	if(a>b)
	{
	System.out.println( a+"number is larger");
	}
	else if(b>a)
	{
	System.out.println( b+" number is larger");
	
	}
	else 
	{
	System.out.println("both are same");
	}
}
}