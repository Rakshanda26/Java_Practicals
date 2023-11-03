import javax.swing.*;
class License
{
public static void main(String[]args)
{
String Cname=JOptionPane.showInputDialog("Enter candidate name");
String Age=JOptionPane.showInputDialog("Enter age");
	int a=Integer.parseInt(Age);
System.out.println("candidate name is " + Cname+ "Age is" +a);
	if(a>18)
	{
    System.out.println("candidate is eligible for license");	
	}
	else
	{
		System.out.println("not eligible");
       
	}
}
} 