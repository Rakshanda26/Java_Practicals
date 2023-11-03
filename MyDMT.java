class Dmt extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Running thread is System Thread");
		}
		else
		{
			System.out.println("Running thread is user Thread");
		}
	}
}
class Test
{
	public static void main(String [] args)
	{
		Dmt T1=new Dmt();
		Dmt T2=new Dmt();
		Dmt T3=new Dmt();
		
		T2.setDaemon(true);
		
		T1.start();
		T2.start();
		T3.start();
	}
}