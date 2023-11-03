import javax.swing.*;
class Sell
{
public static void main(String[]args)
{
String Pname=JOptionPane.showInputDialog("Enter product name");
String Price=JOptionPane.showInputDialog("Enter price");
	int p=Integer.parseInt(Price);
String Qty=JOptionPane.showInputDialog("Enter Qty");
	int q=Integer.parseInt(Qty);
	int Bill=p*q;
System.out.println("product name "+Pname + "price is "+p + "Qty is"+q);
	if(Bill>5000)
	{
	double Fbill=Bill*0.90;
	double dbill=Bill*0.10;
    System.out.println("Bill before diccount is " +Bill);
    System.out.println("Bill after diccount is " +Fbill);
	System.out.println(" diccount amount is " +dbill);	
	}
	else
	{
		System.out.println("Bill is " +Bill);
       
	}
}
} 