class NMT extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+" apla chicken cha "+i+" Piece khat ahe " );
		}
	}
}
class Test
{
	public static void main(String [] args )
	{
		NMT T1=new NMT();
		NMT T2=new NMT();
		NMT T3=new NMT();
		
		//System.out.println("Name before barasa is "+T1.getName());
		//System.out.println("Name before barasa is "+T2.getName());
		//System.out.println("Name before barasa is "+T3.getName());
		
		T1.setName("Sejal");
		T2.setName("Akash");
		T3.setName("Pratik");
		
		T1.start();
		T2.start();
		T3.start();
		
		System.out.println("Name after barasa is "+T1.getName());
		System.out.println("Name after barasa is "+T2.getName());
		System.out.println("Name after barasa is "+T3.getName());	
	}
}