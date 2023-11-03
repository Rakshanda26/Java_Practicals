class IDM extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
	}
}
class Stest
{
	public static void main(String [] args)
	{
		IDM T1=new IDM();
		IDM T2=new IDM();
		IDM T3=new IDM();
		
		T1.setName("sejal");
		T2.setName("aakash");
		T3.setName("pratik");
		
		System.out.println(T1.getName()+" Index no is "+T1.getId());
		System.out.println(T2.getName()+" Index no is "+T2.getId());
		System.out.println(T3.getName()+" Index no is "+T3.getId());
	}
}