abstract class RBIbank
{
	protected double roi;
	public void setdata(double r)
	{
		roi=r;
	}
	abstract public void showdata();
}
abstract class Bank extends RBIbank
{
	protected String Bankname;
	protected String city;
	public void setdata(double r,String Bnm,String ct)
	{
		super.setdata(roi);
		Bankname=Bnm;
		city=ct;
	}
	public void showdata()
	{
		System.out.println("Bankname is "+Bankname);
		System.out.println("city is "+city);
		System.out.println("roi is "+roi);
	}
	abstract public void deposite(int d);
	abstract public void withdraw(int w);
	abstract public void showbal();
}
class SavingAccount extends Bank
{
	private int Accno;
	private int Balance;
	private String name;
	public void setdata(double r,String Bnm,String ct,int ano,int bal,String nm)
	{
		super.setdata(roi,Bnm,ct);
		Accno=ano;
		Balance=bal;
		name=nm;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Accno is "+Accno);
		System.out.println("balance is "+Balance);
		System.out.println("name is "+name);
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
		SavingAccount S1=new SavingAccount();
		S1.setdata(0.10,"ici","kol",1234,4000,"ak");
		S1.showdata();
		S1.deposite(5000);
		S1.showbal();
		S1.withdraw(2000);
		S1.showbal();
	}
}







