import javax.swing.*;
class Checkno
{
public static void main(String[]args)
{
String num=JOptionPane.showInputDialog("enter the number");
	int n=Integer.parseInt(num);
	if(n>0)
	{
	System.out.print("Number is positive");
	}
	else if(n<0)
	{
	System.out.print("Number is negative");
	}
	else
	{
	System.out.print("Number is zero");
	}
}
}
