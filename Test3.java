import javax.swing.*;
class Shop
{
public static void main(String[]args)
{
String pname=JOptionPane.showInputDialog("Enter the product name");
String price=JOptionPane.showInputDialog("Enter the price");
	int p=Integer.parseInt(price);
String qty=JOptionPane.showInputDialog("Enter the qty");
	int q=Integer.parseInt(qty);
	int Bill=p*q;
System.out.print("product name is "+pname+" price is "+p+"qty is "+q+"Bill is"+Bill );
	if(Bill>10000)
	{
	double Fbill=Bill*0.80;
	double Dbill=Bill*0.20;
	System.out.print("final bill is "+Fbill);
	System.out.print("discount bill is "+Dbill);
	}
	else if (Bill>5000)
	{
	double Fbill=Bill*0.90;
	double Dbill=Bill*0.10;
	System.out.print("final bill is "+Fbill);
	System.out.print("discount bill is "+Dbill);
	}
	else
	{
	System.out.print("Bill is "+Bill);
	}
	
}
}