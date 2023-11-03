import javax.swing.*;
class Abc
{
public static void main(String[] args)
{
String name=JOptionPane.showInputDialog("enter the name");
String num=JOptionPane.showInputDialog("enter the number");
	int n=Integer.parseInt(num);
	int a=1;
	while(a<=n)
	{
	System.out.println(name);
	a++;
	}
}
}