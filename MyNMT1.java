class Nmt extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" piece "+i+" khat ahe ");
		}
	}
}
class Test
{
	public static void main(String [] args)
	{
		Nmt T1=new Nmt();
		Nmt T2=new Nmt();
		Nmt T3=new Nmt();
		
		T1.setName("Sejal");
		T2.setName("aakash");
		T3.setName("pratik");
		
		T1.start();
		try
		{
			T1.join(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		T2.start();
		T3.start();
	}
}


