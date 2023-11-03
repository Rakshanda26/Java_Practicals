class Rbi
{
	public int Roi()
	{
		return 0;
	}
}
class Sbi extends Rbi
{
	public int Roi()
	{
		return 7;
	}
}
class Icici extends Rbi
{
	public int Roi()
	{
		return 9;
	}
}
class Axis extends Rbi
{
	public int Roi()
	{
		return 11;
	}
}
class Boi extends Rbi
{
	public int Roi()
	{
		return 9;
	}
}
class Ptest
{
	public static void main(String [] args)
	{
		Sbi S1=new Sbi();
		System.out.println(S1.Roi());
		//Icici I1=new Icici();
		//I1.Roi();
		//Boi B1=new Boi();
		//B1.Roi();
		//Axis A1=new Axis();
		//A1.Roi();
		//System.out.println("Roi of Sbi "+S1.Roi());
		//System.out.println("Roi of Icici "+I1.Roi());
		//System.out.println("Roi of Boi "+B1.Roi());
		//System.out.println("Roi of Axis "+A1.Roi());
	}
}