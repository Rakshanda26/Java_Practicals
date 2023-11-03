class DMT extends Thread
{
	public void run()
	{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("Running thread is service provider thread");
	}
	else
	{
		System.out.println("Running thread is user thread");
	}
	}
}
class Test
{
	public static void main(String [] args )
	{
		DMT T1=new DMT();
		DMT T2=new DMT();
		DMT T3=new DMT();
		
		T2.setDaemon(true);
		
		T1.start();
		T2.start();
		T3.start();
	}
}