class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread running ");
		}
	}
}
class Test
{
	public static void main(String [] args )
	{
		Mythread T1=new Mythread();
		T1.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println("Main thread running");
		}
	}
}