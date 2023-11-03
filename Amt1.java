class Amt extends Thread
{
	public void run()
	{
		for(int i=1;i<=1;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"say with you");
			//System.out.println(Thread.currentThread().getName()+" tu jivant ahes "+isAlive());
		}
	}
}
class Atest
{
	public static void main(String [] args)
	{
		Amt T1=new Amt();
		Amt T2=new Amt();
		Amt T3=new Amt();
		
		T1.setName("Gauri");
		T2.setName("Revti");
		T3.setName("Depali");
		
		T1.start();
		T2.start();
		T3.start();
		
		
		System.out.println("Before breakup list is ");
		System.out.println(" are you mine "+T1.getName()+" "+T1.isAlive());
		System.out.println("are you mine "+T2.getName()+" "+T2.isAlive());
		System.out.println("are you mine "+T3.getName()+" "+T3.isAlive());
		
		//T1.suspend();
		//T1.resume();
		
		T1.stop();
		System.out.println(" After breakup list is ");
		System.out.println("Kay tu jivant ahes "+T1.getName()+" "+T1.isAlive());
		System.out.println("kay tu jivant ahes "+T2.getName()+" "+T2.isAlive());
		System.out.println("kay tu jivant ahes "+T3.getName()+" "+T3.isAlive());
	}
}