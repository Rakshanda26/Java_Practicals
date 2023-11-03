import javax.swing.*;
class Shopping
{
public static void main(String[]args)
{
String Pname=JOptionPane.showInputDialog("Enter product name");
String Price=JOptionPane.showInputDialog("Enter price");
	int p=Integer.parseInt(Price);
String Qty=JOptionPane.showInputDialog("Enter Qty");
	int q=Integer.parseInt(Qty);
	int Bill=p*q;
System.out.println("product name is "+Pname);
System.out.println("price is "+Price);
System.out.println("Qty is "+Qty);
System.out.println("bill is"+Bill);
}
}