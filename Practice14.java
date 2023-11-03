class Account
{
	private int Accno;
	private String name;
	private int balance;
	
	public Account()
	{
		Accno=1101;
		name="suraj";
		balance=5000;
	}
	public void showdata()
	{
		System.out.println("Accno is "+Accno);
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
		}
	}
	public void deposite(int d)
	{
		balance=balance+d;
		System.out.println("balance is "+balance);
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
		Account A1=new Account();
		A1.showdata();
		A1.withdraw(2000);
		A1.showbal();
		A1.deposite(5000);
		A1.showbal();
	}
}




