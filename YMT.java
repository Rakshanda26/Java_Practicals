class YMT extends Thread
{
	public void run()
	{
		for(int i=1;i<=1;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Say aakash is mine for time "+i);
		}
	}
}
class Ytest
{
	public static void main(String [] args )
	{
		YMT T1=new YMT();
		YMT T2=new YMT();
		YMT T3=new YMT();
		
		T1.setName("Gouri");
		T2.setName("Revti");
		T3.setName("Dipali");
		
		T1.start();
		T2.start();
		T3.start();
		
		T3.yield();
		System.out.println(Thread.currentThread().getName()+"Say hi akash");
		
		//for(int i=1;i<=1;i++)
		//{
		//	T1.yield();
			System.out.println(Thread.currentThread().getName()+" Say hi aakash");
		//}
	}
}