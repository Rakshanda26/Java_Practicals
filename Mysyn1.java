class Aakash
{
	public void Manus(String nm)
	{
		for(int i=1;i<=2;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println(Thread.currentThread().getName()+" say aakash is mine,I told you "+i+" times ");
		}
	}
}
class Mythread1 extends Thread
{
	Aakash A;
	Mythread1(Aakash A)
	{
		this.A=A;
	}
	public void run()
	{
		A.Manus("Gauri");
	}
}
class Mythread2 extends Thread
{
	Aakash A;
	Mythread2(Aakash A)
	{
		this.A=A;
	}
	public void run()
	{
		A.Manus("Revti");
	}
}
class Atest
{
	public static void main(String [] args)
	{
		Aakash M=new Aakash();
		Mythread1 T1=new Mythread1(M);
		Mythread2 T2=new Mythread2(M);
		
		T1.setName("Gouri");
		T2.setName("Revti");
		T1.start();
		T2.start();
	}
}










