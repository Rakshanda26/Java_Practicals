class Nmt extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
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
	
	T1.setName("akash");
	T2.setName("pratik");
	
	T1.start();
	T2.start();
	}
	
}