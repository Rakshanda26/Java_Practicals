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
class Saccount extends Person
{
	private int Accno;
	private int balance;
	
	public void setdata(String nm,String ct,int ano,int bal)
	{
		super.setdata(nm,ct);
		Accno=ano;
		balance=bal;
	}
	
	public void showdata()
	{
		super.showdata();
		System.out.println("Accno is "+Accno);
		System.out.println("balance is "+balance);
	}
	public void deposite(int d)
	{
		balance=balance+d;
		System.out.println("Amout after deposite "+d+" your balance is "+balance);
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
			System.out.println("After withdraw "+w+" Your balance is "+balance);
		}
	}
	public void showbal()
	{
		System.out.println("Your avalaible balance is "+balance);		
	}
}
class FixedDeposite extends Person
{
	private int balance;
	private int year;
	private double Roi;
		
	public void setdata(String nm,String ct,int b,int y,double r)
	{
		super.setdata(nm,ct);
		balance=b;
		year=y;
		Roi=r;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("balance is "+balance);
		System.out.println("year is "+year);
		System.out.println("Roi is "+Roi);
	}
	
	public void MaturityAmmount()
	{
		double mamt=balance+(balance*Roi)*year;
		System.out.println("maturity amount is "+mamt);
	}	
}
class Worker extends Person
{
	private int Wages;
	private int Wday;
	
	public void setdata(String nm,String ct,int wg,int wd)
	{
		super.setdata(nm,ct);
		Wages=wg;
		Wday=wd;
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("Wages is "+Wages);
		System.out.println("Wdays are "+Wday);
	}
	
	public void payment()
	{
		int pay=Wages*Wday;
		System.out.println("Payment is "+pay);
	}
}

class Htest
{
	public static void main(String [] args)
	{
	Saccount S1=new Saccount();
	S1.setdata("Raksha","Kol",101,7000);
	S1.deposite(3000);    
	S1.showbal();
	S1.withdraw(2000);
	S1.showbal();
	
	FixedDeposite F1=new FixedDeposite();
	F1.setdata("raj","kol",100000,5,0.10);
	F1.showdata();
	F1.MaturityAmmount();
	
	Worker W1=new Worker();
	W1.setdata("Suraj","kol",2200,22);
	W1.showdata();
	W1.payment();
	}
}

















