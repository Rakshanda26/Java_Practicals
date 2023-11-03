class Employe
{
private int empid;
private String name;
private int wages;
private int  wdays;

public void setdata(int ei,String nm,int wg,int wd)
{
		empid=ei;
		name=nm;
		wages=wg;
		wdays=wd;
}
public void showdata()
{
	System.out.println("empid is "+empid);
	System.out.println("name is "+name);
	System.out.println("wages is "+wages);
	System.out.println("wdays are "+wdays);
}

public void Payment()
{
	int pay=wages * wdays;
	System.out.println("Payment is "+pay);
	if(pay>25000)
	{
        double Fpay=0.82*pay;
		double Gpay=0.18*pay;
		System.out.println("Payment after gst cutting is "+Fpay);
		System.out.println("Gst amount is "+Gpay);
	}
		else
		{
			System.out.println("Your payment is "+pay);
		}
	 
}
}

class Emptest
{
public static void main(String [] args)
{
		Employe E1=new Employe();
	    E1.setdata(10,"ss",2000,22);
		E1.showdata();
		int p2=E1.Payment();
		
		Employe E2=new Employe();
		E2.setdata(20,"ff",2002,23);
		E2.showdata();
		int p1 =E2.Payment();
		int p=p1+p2;
		System.out.println("Addition is "+p);
		
	

}	
}