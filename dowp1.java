import javax.swing.*;
class Dmart
{
public static void main(String[]args)
{
    int p,Fbill=0
	do
	{
	String pname=JOptionPane.showInputDialog("enter the product name");
	String price=JOptionPane.showInputDialog("enter the price");
		 p=Integer.parseInt(price);
	String qty=JOptionPane.showInputDialog("enter the qty");
		int q=Integer.parseInt(qty);
		int bill=p*q;
		Fbill=Fbill+bill;
		
		System.out.print("product name is "+pname + " price is "+p + "qty is "+q + " bill is "+bill);
	}
	while(p!=0);
	System.out.println("Fbill is "+Fbill);
}
}