class Shopping
{
private String Pname;
private int Price;
private int Qty;

public void setdata(String Pnm,int P,int Q)
{
	Pname=Pnm;
	Price=P;
	Qty=Q;
}
public void showdata()
{
System.out.println("name of product is "+Pname);
System.out.println("Price of product is "+Price);
System.out.println("Qty of is "+Qty);
}
public void Bill()
{
	int Bill=Price*Qty;
	System.out.println("Bill is"+Bill);
	if(Bill>5000)
	{
		double Fbill=0.90*Bill;
		double Dbill=0.10*Bill;
		System.out.println("Final bill is "+Fbill);
		System.out.println("Discount  bill is "+Dbill);
	}
	else
	{
			System.out.println("YOur bill is "+Bill);
	}
}
}

class Stest
{
public static void main(String [] args)
{
	Shopping S1=new Shopping();
	S1.setdata("jeans",5200,1);
	S1.showdata();
	S1.Bill();	
}
}