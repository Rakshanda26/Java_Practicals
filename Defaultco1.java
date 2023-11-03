class Account
{
	private String name;
	private int Accno;
	private int balance;

	public Account()
	{
		name="Raksha";
		Accno=46;
		balance=7000;
	}
	
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("Accno is "+Accno);
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
			System.out.println("After withdraw "+w+"your balance is "+balance);
		}
	}
	
	public void deposite(int d)
	{
		balance=balance+d;
		System.out.println("After deposite "+d+"your balance is "+balance);
	}
	
	public void showbal()
	{
		System.out.println("Your available balnce is "+balance);
	}
}

class Atest
{
	public static void main(String [] args)
	{
	Account A1=new Account();
	A1.showdata();
	A1.withdraw(5000);
	A1.showbal();
	A1.deposite(2000);
	A1.showbal();
	}
}