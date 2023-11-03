class Account
{
	private int accno;
	private String name;
	private int balance;
	
	public Account()
	{
		accno=47;
		name="Raj";
		balance=10000;
	}
	
	public void showdata()
	{
		System.out.println("Account no is "+accno);
		System.out.println("name is "+name);
		System.out.println("balance is "+balance);
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
	
	public void deposite(int d)
	{
		balance=balance+d;
		System.out.println("after deposite "+d+" Your balance is "+balance);
	}
	
	public void showbal()
	{
		System.out.println("Your balance is "+balance);
	}
}
class Atest
{
	public static void main(String [] args)
	{
		Account M1=new Account();
		M1.showdata();
		M1.withdraw(5000);
		M1.showbal();
		M1.deposite(4500);
		M1.showbal();
	}
}







