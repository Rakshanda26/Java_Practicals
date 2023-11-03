import javax.swing.*;
class Payment
{
public static void main(String[]args)
{
String ename=JOptionPane.showInputDialog("Enter the name");
String wages=JOptionPane.showInputDialog("Enter the wages");
	int wg=Integer.parseInt(wages);
String wdays=JOptionPane.showInputDialog("Enter the working days");
	int wd=Integer.parseInt(wdays);
	int pay=wd*wg;
System.out.println("employee name is "+ename+"wages is "+wg+"working days are "+wd);
	if(pay>25000)
	{
	double Fpay=pay*0.82;
	double Gpay=pay*0.18;
	System.out.println("payment is "+pay);
	System.out.println("Final payment is "+Fpay);
	System.out.println("Gst amount is "+Gpay);
	}
	else
	{
	System.out.println("payment is "+pay);
	}
}
}