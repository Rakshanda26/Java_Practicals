class Amt extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"say with you");
		}
	}
}
class Atest
{
	public static void main(String [] args)
	{
		Amt T1=new Amt();
		Amt T2=new Amt();
		Amt T3=new Amt();
		
		T1.setName("Gauri");
		T2.setName("Revti");
		T3.setName("Depali");
		
		T1.start();
		T2.start();
		T3.start();
		
		T1.suspend();
		
		
	}
}