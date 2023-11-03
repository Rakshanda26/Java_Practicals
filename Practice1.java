import javax.swing.*;
class Shopping
{
public static void main(String[]args)
{
String Pname=JOptionPane.showInputDialog("Enter the Product name ");
String Price=JOptionPane.showInputDialog("Enter the Price ");
	int p=Integer.parseInt(Price);
String Qty=JOptionPane.showInputDialog("Enter the Qty ");
	int q=Integer.parseInt(Qty);
	int Bill=p*q;
System.out.println("Product name is "+Pname\n+"Price is "+p\n+"Qty is "+q );
System.out.println("Bill is "+Bill);
}
}

