class person
{
	protected String name;
	protected String city;
	protected int wages;
	protected int wday;
	
	public void setdata(String nm,String ct,int wg,int wd)
	{
		name=nm;
		city=ct;
		wages=wg;
		wday=wd;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
		System.out.println("wages is "+wages);
		System.out.println("wday is "+wday);
	}
	abstract public void payment(int p);
}
class Employ extends Person
{
	public void showdata()
	{
		super.showdata();
	}
	public void payment(int p)
	{
		payment=wages*wday;
		System.out.println("Payment is "+payment);
	}
}
class Manager extends Person
{
	protected int commission
	public void setdata(int c)
	{
		commission=c;
		
	}
}









