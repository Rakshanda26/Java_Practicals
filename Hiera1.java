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
class SavingAccount extends Person
{
	private int accountno;
	private int balance;
	
	public void setdata(String nm,String ct,int ano,int bal)
	{
		super.setdata(nm,ct);
		accountno=ano;
		balance=bal;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("accountno is "+accountno);
		System.out.println("balance is "+balance);
	}
	public void deposite(int d)
	{
		balance=balance+d;
		System.out.println("After deposite "+d+"Your balance is "+balance);
	}
	public void withdraw(int w)
	{
		if(w>balance)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance=balance-w;
			System.out.println("After withdraw "+w+" your balance is "+balance);
		}
	}
	public void showbal()
	{
		System.out.println("Your avilable balance is "+balance);
	}
}
class FixedDeposite extends Person
{
	private int balance;
	private double Rateofinterest;
	private int year;
	
	public void setdata(String nm,String ct,int bal,double roi,int y)
	{
		super.setdata(nm,ct);
		balance=bal;
		Rateofinterest=roi;
		year=y;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("balance is "+balance);
		System.out.println("Rateofinterest is "+Rateofinterest);
		System.out.println("year is "+year);
	}
	public void MaturityAmmount()
	{
		double Mamount=balance+(balance*Rateofinterest)*year;
		System.out.println("MaturityAmmount is "+Mamount);
	}
}
class Worker extends Person
{
	private int wages;
	private int wdays;
	
	public void setdata(String nm,String ct,int wg,int wd)
	{
		super.setdata(nm,ct);
		wages=wg;
		wdays=wd;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("wages is "+wages);
		System.out.println("wdays are "+wdays);
	}
	public void payment()
	{
		int pay=wages*wdays;
		System.out.println("payment is "+pay);
	}
}
class Wtest
{
	public static void main(String [] args)
	{
		SavingAccount S1=new SavingAccount();
		S1.setdata("Raksha","kol",3600,10000);
		S1.showdata();
		S1.deposite(5000);
		S1.showbal();
		S1.withdraw(2000);
		S1.showbal();
	
		FixedDeposite F1=new FixedDeposite();
		F1.setdata("raj","kol",100000,0.10,2);
		F1.showdata();
		F1.MaturityAmmount();

		Worker W1=new Worker();
		W1.setdata("ram","kol",5000,28);
		W1.showdata();
		W1.payment();
	}
}
















