class IDM extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ");
	}
}
class Itest
{
	public static void main(String [] args )
	{
		IDM T1=new IDM();
		IDM T2=new IDM();
		IDM T3=new IDM();
		
		T1.setName("Revti");
		T2.setName("Gouri");
		T3.setName("Deepali");
		
		System.out.println(T1.getName()+" Index no is "+T1.getId());
		System.out.println(T2.getName()+" Index no is "+T2.getId());
		System.out.println(T3.getName()+" Index no is "+T3.getId());
	}
}