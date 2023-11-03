class Myrunnable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread is running ");
		}
	}
}
class Test
{
	public static void main(String [] args)
 {
	Myrunnable M1=new Myrunnable();
	Thread T1=new Thread(M1);
	T1.start();
	for(int i=1;i<=10;i++)
	{
		System.out.println("Main thread is running");
	}
 }
}