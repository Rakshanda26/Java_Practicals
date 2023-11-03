import javax.swing.*;
class Name
{
public static void main(String[]args)
{
String name=JOptionPane.showInputDialog("Enter the name");
String num=JOptionPane.showInputDialog("Enter the number");
	int n=Integer.parseInt(num);
    int a=1;
	while(a<=n)
	{
		System.out.println(name);
		a++;
	}
}
}