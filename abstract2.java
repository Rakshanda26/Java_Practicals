abstract class RBI
{
	protected double roi;
	public void setdata(double n)
	{
		roi=n;
	}
	abstract public void showdata();
}
abstract class Bank extends RBI
{
	protected String Bankname,city;
	public void setdata(double roi,String bnm,String ct)
	{
		super.setdata(roi);
		Bankname=bnm;
		city=ct;
	}
	public void showdata()
	{
		System.out.println("roi is "+roi);
		System.out.println("Bankname is "+Bankname);
		System.out.println("city is "+city);
	}
	abstract public void deposite(int d);
	abstract public void withdraw(int w);
	abstract public void showbal();
}
class SavingAccount extends Bank
{
	private String name;
	private int Accno,Balance;
	public void setdata(double roi,String bnm,String ct,String nm,int AC,int bal)
	{
		super.setdata(roi,bnm,ct);
		name =nm;
		Accno=AC;
		Balance=bal;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("name is "+name);
		System.out.println("Accno is "+Accno);
		System.out.println("Balance is "+Balance);
	}
	public void deposite(int d)
	{
		Balance =Balance+d;
	}
	public void withdraw(int w)
	{
		Balance=Balance-w;
	}
	public void showbal()
	{
		System.out.println("Balance is"+Balance);
	}
}
class Atest
{
	public static void main(String [] args)
	{
		SavingAccount A1=new SavingAccount();
		A1.setdata(0.10,"ICICI","KOL","RAJ",420,4200);
		A1.showdata();
		A1.deposite(7000);
		A1.showbal();
		A1.withdraw(4000);
		A1.showbal();
		
	}
}


















