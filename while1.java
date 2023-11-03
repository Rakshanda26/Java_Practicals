import javax.swing.*;
class Abc
{
public static void main(String [] args)
{
String Name=JOptionPane.showInputDialog("Enter the Name ");
String Num=JOptionPane.showInputDialog(" Enter the Number");
	int n=Integer.parseInt(Num);
	while(n<=25)
	{
	System.out.println(Name);
	n++;
	}
}
}