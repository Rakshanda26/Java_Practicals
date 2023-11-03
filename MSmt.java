class Smt extends Thread
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

class Test
{
	public static void main(String [] args)
	{
		Smt T1=new Smt();
		Smt T2=new Smt();
		Smt T3=new Smt();
		
		T1.start();
		T2.start();
		T3.start();
		
		
	}
}
