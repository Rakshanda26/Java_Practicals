import javax.swing.*;
class Employ
{
	private String ename;
	private int wages;
	private int wdays;
	
	public void setdata()
	{ 
	ename=JOptionPane.showInputDialog("Enter the name "+ename);
	String wg=JOptionPane.showInputDialog("Enter the wages ");
		wages=Integer.parseInt(wg);
	String wd=JOptionPane.showInputDialog("Enter the wdays ");
		wdays=Integer.parseInt(wd);
	}
	
	public void showdata()
	{
		System.out.println("Enter the name "+ename);
		System.out.println("Enter the wages "+wages);
		System.out.println("Enter the working days "+wdays);
	}
	
	public int Payment()
	{
		int pay=wages*wdays;
		System.out.println("Your payment is "+pay);
		if(pay>25000)
		{
			double Fpay=0.82*pay;
			double Gpay=0.18*pay;
			System.out.println("Payment after gst cutting is "+Fpay);
			System.out.println("Gst amount is "+Gpay);
			return pay;
		}
		else
		{
			System.out.println("Your payment is "+pay);
			return pay;
			
		}
	}
}

class Etest
{
	public static void main(String[]args)
	{
		Employ E1=new Employ();
		E1.setdata();
		E1.showdata();
		double P1=E1.Payment();
		
		Employ E2=new Employ();
		E2.setdata();
		E2.showdata();
		double P2=E2.Payment();
		
		double P=P1+P2;
		System.out.println("Addition of payment of two employ is "+P);
	}
}







