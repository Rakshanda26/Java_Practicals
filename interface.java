interface std1
{
	abstract public void holiday();
}
interface std2
{
	abstract public void dresscode();
}
interface std3
{
	abstract public void wdays();
}
class JP implements std1,std2,std3
{
	public void holiday()
	{
		System.out.println("Friday to monday will be holiday");
	}
	public void dresscode()
	{
		System.out.println("friday will be dresscode");
	}
	public void wdays()
	{
		System.out.println("Mangalwar to guruwar is working days");
	}
}
class Amdocs implements std1,std3
{
	public void holiday()
	{
		System.out.println("sat and sun will be holiday");
	}
	public void wdays()
	{
		System.out.println("monday to friday will be working days");
	}
}
class Job
{
	public static void main(String [] args)
	{
		JP J1=new JP();
		J1.holiday();
		J1.dresscode();
		J1.wdays();
		
		Amdocs A1=new Amdocs();
		A1.holiday();
		A1.wdays();
	}
}


























