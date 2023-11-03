class Jmt extends Thread
{
	public void run()
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
		System.out.println("Chiken che piece no"+i);
		}
	}
}
class Stest
{
	public static void main(String [] args)
	{
		Jmt T1=new Jmt();
		Jmt T2=new Jmt();
		Jmt T3=new Jmt();
		
		T1.start();
		try
		{
			T1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		T2.start();
		T3.start();
	}
}