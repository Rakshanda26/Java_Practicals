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
		System.out.println("Chiken che pieces no "+i);
		}
		
	}
}
class Test
{
	public static void main(String [] args)
	{
		Smt t1=new Smt();
		Smt t2=new Smt();
		Smt t3=new Smt();
		//t1.start();
		//t2.start();
		//t3.start();
		
		t1.start();
		try
		{
			t1.join();	
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		t2.start();
		t3.start();
	}
}
