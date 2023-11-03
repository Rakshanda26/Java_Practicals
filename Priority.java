class PMT extends Thread
{
	public void run()
	{
		System.out.println("name of thread "+Thread.currentThread().getName());
		System.out.println("Priority of thread "+Thread.currentThread().getPriority());
	}
}
class Ptest
{
	public static void main(String [] args)
	{
		PMT T1=new PMT();
		PMT T2=new PMT();
		PMT T3=new PMT();
		
		//T1.setName("reva");
		//T2.setName("gita");
		//T3.setName("sita");
		
		T1.setPriority(Thread.MIN_PRIORITY);
		T2.setPriority(Thread.MAX_PRIORITY);
		
		T1.start();
		T2.start();
		T3.start();
	}
}