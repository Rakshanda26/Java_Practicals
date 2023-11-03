class Employ
{
	private String ename;
	private int wages;
	private int wdays;
	
	public void setdata(String enm,int wg,int wd)
	{
		ename=enm;
		wages=wg;
		wdays=wd;
	}
	public void showdata()
	{
		System.out.println("Enter the name "+ename);
		System.out.println("Enter the wages "+wages);
		System.out.println("Enter the wdays "+wdays);
	}
	public double Payment()
	{
		double Pay=wages*wdays;
		System.out.println("Your payment is "+Pay);
		if(Pay>25000)
		{
			double Fpay=0.82*Pay;
			double Gpay=0.18*Pay;
			System.out.println("Payment after gst cutting is "+Fpay);
			System.out.println("Amout of Gst cuttig is "+Gpay);
			return Fpay;

		}
		else
		{
			System.out.println("Your Payment is "+Pay);
			return Pay;
		}
	}
}
class Etest
{
	public static void main(String [] args)
	{
		Employ E1=new Employ();
		E1.setdata("raksha",2000,20);
		E1.showdata();
		double P1=E1.Payment();
		
		Employ E2=new Employ();
		E2.setdata("raj",2200,22);
		E2.showdata();
		double P2=E2.Payment();
		
		double P=P1+P2;
		System.out.println("Addition of payment of two employ is "+P);
	}
}