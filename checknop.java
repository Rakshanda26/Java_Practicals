import javax.swing.*;
class checkno
{
public static void main(String[]args)
{
String num1=JOptionPane.showInputDialog("Enter the number1");
	int a=Integer.parseInt(num1);
String num2=JOptionPane.showInputDialog("Enter the number2");
	int b=Integer.parseInt(num2);
	if(a>b)
	{
	System.out.print("a is larger"+a);
	}
	else if(b>a)
	{
	System.out.print("b is larger"+b);
	}
	else
	{
	System.out.print("both are same");
	}
	
}
}