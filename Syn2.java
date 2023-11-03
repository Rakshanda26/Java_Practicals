class AAKASH
{
	synchronized void Manus(String nm)
	{
		for(int i=1;i<=2;i++)
		{
		System.out.println(Thread.currentThread().getName()+" say aakash is mine "+" I told you "+i+" times ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Mythread1 extends Thread
{
	AAKASH N;
	Mythread1(AAKASH N)
	{
		this.N=N;
	}
	public void run()
	{
		N.Manus("Gauri");
	}
}
class Mythread2 extends Thread
{
	AAKASH N;
	Mythread2(AAKASH N)
	{
		this.N=N;
	}
	public void run()
	{
		N.Manus("Revti");
	}
}
class Stest
{
	public static void main(String [] args)
	{
		AAKASH A=new AAKASH();
		Mythread1 T1=new Mythread1(A);
		Mythread2 T2=new Mythread2(A);
		
		T1.setName("Gauri");
		T2.setName("Revti");
		
		T1.start();
		T2.start();
	}
}





