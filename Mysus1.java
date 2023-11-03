class AMT extends Thread
{
	public void run()
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
class Atest
{
	public static void main(String [] args)
	{
		AMT t1=new AMT();
		AMT t2=new AMT();
		AMT t3=new AMT();
		
		t1.setName("gauri");
		t2.setName("revti");
		t3.setName("dipali");
		
		t1.start();
		t2.start();
		t3.start();
		
		//t1.suspend();
		t1.stop();
		
		System.out.println(t1.getName()+t1.isAlive());
	}
	
}
