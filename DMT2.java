class DMT extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+"jevayla vadhat ahe");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"Potbhar jeva");
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
		
		T1.setName("dig");
		T2.setName("Gous");
		T3.setName("Rohit");
		
		T2.setDaemon(true);
		
		T1.start();
		T2.start();
		T3.start();
		
	}
}