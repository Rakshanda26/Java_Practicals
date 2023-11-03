class Bank
{
	public int Rateofinterest()
	{
		return 0;
	}
}
class Sbi extends Bank
{
	public int Rateofinterest()
	{
		return 7;
	}
}
class Ptest
{
	public static void main(String[]args)
	{
		Bank B1=new Bank();
		B1.Rateofinterest();
		Sbi S1=new Sbi();
		S1.Rateofinterest();
		System.out.println("Rateofinterest of Bank "+B1.Rateofinterest());
		System.out.println("Rateofinterest of Sbi"+S1.Rateofinterest());
	}
}