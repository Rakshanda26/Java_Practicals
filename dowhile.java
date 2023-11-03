import javax.swing.*;
class Dtest
{ 
public static void main(String[]args)
{
	int n,sum=0;
	do
	{
	String num=JOptionPane.showInputDialog("Enter number");
	n=Integer.parseInt(num);
	sum=sum+n;
	}
	while(n!=0);
	{
	System.out.println("sum of all no is "+sum);
	}
}
}