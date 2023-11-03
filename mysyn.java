class pada
{
	synchronized void printpada(int n)
	{
		for(int i=1;i<=10;i++)
		{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(n*i);
		}
	}
}
class Mythread1 extends Thread
{
	pada p;
	Mythread1(pada p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printpada(13);
	}
}
class Mythread2 extends Thread
{
	pada p;
	Mythread2(pada p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printpada(12);
	}
}
class Stest
{
	public static void main(String [] args)
	{
		pada o=new pada();
		Mythread1 t1=new Mythread1(o);
		Mythread2 t2=new Mythread2(o);
		
		t1.start();
		t2.start();
	}
}






