class Smt extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread is running");
		}
	}
}
class Stest
{
	public static void main(String [] args )
	{
		Smt T1=new Smt();
		Smt T2=new Smt();
		T1.start();
		T2.start();
		for(int i=1;i<=4;i++)
		{
			System.out.println("Main thread is running");
		}
		
	}
}