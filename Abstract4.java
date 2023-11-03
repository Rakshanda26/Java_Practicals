abstract class Person
{
	protected String name;
	protected String city;
	protected int wages;
	protected int wdays;
	
	public void setdata(String nm,String ct,int  wg,int wd)
	{
		name=nm;
		city=ct;
		wages=wg;
		wdays=wd;
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
		System.out.println("wages is "+wages);
	    System.out.println("wdays is "+wdays);
	}
	abstract public void payment();
	
}
class Employ extends Person
{
	    public void setdata(String nm,String ct,int  wg,int wd)
		{
		    super.setdata(nm,ct,wg,wd);
	    }
		public void showdata()
		{
	       super.showdata();
		}
	public void payment()
	{
		Pay=wages*wdays;
		System.out.println("payment is "+Pay);
	}
}
class Manager extends Person
{
	    public void setdata(String nm,String ct,int  wg,int wd)
		{
		    super.setdata(nm,ct,wg,wd);
	    }
		public void showdata()
		{
	       super.showdata();
		}
	public void payment()
	{
		Pay=wages*wdays;
		System.out.println("payment is "+Pay);
	}
}
class Ptest
{
	public static void main(String [] args)
	{
		Employ E1=new Employ();
		E1.setdata("raj","kol",500,10);
		E1.showdata();
		E1.payment();
		
		Manager M1=new Manager();
		M1.setdata("abc","kol",2000,22);
		M1.showdata();
		M1.payment();
	}
}