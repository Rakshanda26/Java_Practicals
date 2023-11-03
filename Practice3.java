import javax.swing.*;
class Shopping
{
public static void main(String[]args)
{
String Pname=JOptionPane.showInputDialog("Enter the Product name");
String Price=JOptionPane.showInputDialog("Enter the Price ");
	int P=Integer.parseInt(Price);
String Qty=JOptionPane.showInputDialog("Enter the Qty");
	int Q=Integer.parseInt(Qty);
	int Bill=P*Q;
System.out.println("Product name is "+Pname + "Price is "+P + "Qty is "+Q);
	if(Bill>=5000)
	{
	double Fbill=Bill*0.9;
	double dbill=Bill*0.10;
System.out.println("Bill before discount is "+Bill);
System.out.println("Final bill is "+Fbill);
System.out.println("Discount is "+dbill);
	}
	else
	{
	System.out.println("Bill is "+Bill);
	}
}
}