class Employ
{
	private String name;
	private int Empid;
	private int Wages;
	private int Wdays;
	
	public void setdata(String nm,int ei,int wg,int wd)
	{
		name=nm;
		Empid=ei;
		Wages=wg;
		Wdays=wd;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("Empid is "+Empid);
		System.out.println("Wages is "+Wages);
		System.out.println("Wdays are "+Wdays);
	}
	public double payment()
	{
		double pay=Wages*Wdays;
		if(pay>25000)
		{
			double Fpay=0.82*pay;
			double Gpay=0.18*pay;
			System.out.println("Final payment is "+Fpay);
			System.out.println("Gst payment is "+Gpay);
			return Fpay;
		}
		else
		{
			System.out.println("Payment is "+pay);
		}
		return pay;
	}
}
class Etest
{
	public static void main(String[]args)
	{
		Employ E1=new Employ();
		E1.setdata("rr",10,2200,22);
		E1.showdata();
		double p1=E1.payment();
		
		Employ E2=new Employ();
		E2.setdata("ss",14,4400,23);
		E2.showdata();
		double p2=E2.payment();
		
		double p=p1+p2;
		System.out.println("Addition is "+p);
		
	}
}
