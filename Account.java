class Account
{
private String Name;
private int Accno,Balance;
public Account()
{
	Name="Raksha";
	Accno=1001;
	Balance=7000;
}
public void showdata()
{
System.out.println("Account no is "+Accno);
System.out.println("Name is "+Name);
System.out.println("Balance is "+Balance);
}
public void withdraw(int w)
{
	if(w>Balance)
	{
	System.out.println("Insufficient balance");
	}
	else
	{
	Balance=Balance-w;
	System.out.println("After withdraw"+w+"balance is "+Balance);
	}	
}
public void deposite(int d)
{
Balance=Balance+d;
System.out.println("After deposite "+d+"Current balance "+Balance);
}
public void showbal()
{
System.out.println("your available balance is "+Balance);
}
}
class Atest
{
public static void main(String [] args)
{
Account A1;
A1=new Account();
A1.showdata();
A1.withdraw(5000);
A1.showbal();
A1.deposite(12000);
A1.showbal();
}
}






