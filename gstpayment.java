import javax.swing.*;
class Payment
{
public static void main(String[]args)
{
String ename=JOptionPane.showInputDialog("Enter employ name");
String wages =JOptionPane.showInputDialog("Enter wages");
	int wg=Integer.parseInt(wages);
String wdays=JOptionPane.showInputDialog("Enter wdays");
	int w=Integer.parseInt(wdays);
	int pay=wg*w;
System.out.println(" employ name is "+ename);
System.out.println("wages is "+wg);
System.out.println("wdays is "+w);
System.out.println("payment is"+pay);
	if(pay>25000)
	{
	double Fpay=pay*0.82;
	double Gpay=pay*0.18;
	System.out.println(" payment before gst is "+pay);
	System.out.println(" payment after gst is "+Fpay);
	System.out.println(" gst amount is "+Gpay);
	
	}
	else
	{
	System.out.println(" payment is "+pay);
	}
}
}