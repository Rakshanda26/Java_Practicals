class Etest
{
	public static void main(String [] args)
	{
		try
		{
			int AC[]=new int[3];
			AC[2]=4/2;
			System.out.println(AC[2]);
		}
		catch(NullPointerException e1)
		{
			System.out.println(e1);
		}
		catch(ArithmeticException e2)
		{
			System.out.println(e2);
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Bhava tuza array itka big nhiy");
		}
		catch(Exception e4)
		{
			System.out.println("Hey i will manage everything");
		}
		System.out.println("Bhava apla index check kar");
		System.out.println("Your program excute nomally");
	}
}