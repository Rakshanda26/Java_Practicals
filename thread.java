class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child Thread running");
		}
	}
}
class Test
{
	public static void main(String [] args)
	{
		Mythread E1=new Mythread();
		E1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main thread is running");
		}
	}
}