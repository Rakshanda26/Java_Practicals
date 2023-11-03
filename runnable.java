class Myrunnable implements Runnable
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
		Myrunnable r=new Myrunnable();
		Thread T1=new Thread(r);
	    T1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main block execute");
		}
	}
} 