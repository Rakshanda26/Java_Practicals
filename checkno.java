import javax.swing.*;
class Number
{
public static void main(String[] args)
{
String num=JOptionPane.showInputDialog("enter number");
	int n=Integer.parseInt(num);
	if(n>0)
	{
	System.out.println(n+"is positive number");	
	}
	else if(n<0)
	{
	System.out.println(n+"is negative number");
	}
	else
	{
	System.out.println("number is zero");
	}
}
}