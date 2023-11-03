class AMT extends Thread
{
	public void run()
	{
	try
	{
		Thread.sleep(1000);
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		System.out.println(Thread.currentThread().getName()+" Say with you ");
	}
}
class Atest
{
	public static void main(String [] args)
	{
	AMT t1=new AMT();
	AMT t2=new AMT();
	AMT t3=new AMT();
	
	t1.setName("Gauri");
	t2.setName("revti");
	t3.setName("depali");
	
	t1.start();
	t2.start();
	t3.start();
	
	//t1.suspend();
	//t1.resume();
	t1.stop();
	
	System.out.println(t1.getName()+" tu jivant ahes "+t1.isAlive());
	System.out.println(t2.getName()+"tu jivant ahes "+t2.isAlive());
	System.out.println(t3.getName()+"tu jivant ahes "+t3.isAlive());
	}
}