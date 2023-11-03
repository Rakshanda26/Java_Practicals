class Ayaan
{
	static void eligible(int age)
	{
		if(age<21)
		
			throw new ArithmeticException("you are not eligible plz try after some year");
		
			else
			
				System.out.println("congrats change the status");
			
	}
	public static void main(String [] args)
	{
	eligible(20);
	System.out.println("bhavach rest life");
	}
}
