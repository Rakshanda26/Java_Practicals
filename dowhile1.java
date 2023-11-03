import javax.swing.*;
class Dmart
{
public static void main(String[]args)
{
	int p,Fbill=0;
	do
	{
	String pname=JOptionPane.showInputDialog("enter the name");
	String price=JOptionPane.showInputDialog("enter the price");
		 p=Integer.parseInt(price);
	String qty=JOptionPane.showInputDialog("enter the Qty");
		int q=Integer.parseInt(qty);
		int Bill=p*q;
	    Fbill=Fbill+Bill;
	System.out.print("product name ="+pname + " price is "+p +"Qty is "+q + " Bill is "+Bill);
	}
	while(p!=0);
	{
	System.out.println("final bill is"+Fbill);
	}
}
}