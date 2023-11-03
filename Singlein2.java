class Person
{
	private String name;
	private String city;
	
	public void setdata(String nm,String ct)
	{
		name=nm;
		city=ct;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
	}
}
class Customer extends Person
{
	private String pname;
	private int price;
	private int qty;
	
	public void setdata(String nm,String ct,String pnm,int p,int q)
	{
		super.setdata(nm,ct);
		pname=pnm;
		price=p;
		qty=q;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("product name is "+pname);
		System.out.println("price is "+price);
		System.out.println("qty is "+qty);
	}
	public void bill()
	{
		int Bill=price*qty;
		System.out.println("Bill is "+Bill);
	}
}
class Htest
{
	public static void main(String[]args)
	{
	    Customer C1=new Customer();
		C1.setdata("raksha","kol","jeans",2000,2);
		C1.showdata();
		C1.bill();
	}
}




