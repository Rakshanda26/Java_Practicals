 class Pada
{
	 synchronized public void Printpada(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
}
class Mythread1 extends Thread
{
	Pada P;
	Mythread1(Pada P)
	{
	this.P=P;
	}
	public void run()
	{
		P.Printpada(5);
	}
}
class Mythread2 extends Thread
{
	Pada P;
	Mythread2(Pada P)
	{
		this.P=P;
	}
	public void run()
	{
		P.Printpada(7);
	}
}
class Stest
{
	public static void main(String [] args)
	{
		Pada O=new Pada();
		Mythread1 T1=new Mythread1(O);
		Mythread2 T2=new Mythread2(O);
		T1.start();
		T2.start();
	}
}



 