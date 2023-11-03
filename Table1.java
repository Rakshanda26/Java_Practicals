import javax.swing.*;
class Table
{
public static void main(String [] args)
{
	int i=1;
String num=JOptionPane.showInputDialog("Enter the number");
	int n=Integer.parseInt(num);
	while(i<=10)
	{
	System.out.println(n*i);
	i++;
	}
}
}