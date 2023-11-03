import javax.swing.*;
class Table
{
public static void main(String[]args)
{
String num=JOptionPane.showInputDialog("enter the number");
	int n=Integer.parseInt(num);
	int i=1;
	while(i<=10)
	{
	System.out.println(n*i);
	i++;
	}
}
}