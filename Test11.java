class Addition
{
	public void sum(int x,int y)
	{
		int S=x+y;
		System.out.println("Addition is "+S);
	}
	public void sum(int x,int y,int z)
	{
		int S=x+y+z;
		System.out.println("Addition is "+S);
	}
}
class Test
{
	public static void main(String [] args )
	{
		 Addition A1=new Addition();
		 A1.sum(5,10);
		 A1.sum(5,10,15);
		 
		
	}
}