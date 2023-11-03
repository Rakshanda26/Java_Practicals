import java.util.*;
class Atest
{
	public static void main(String [] args)
	{
		ArrayList<String>A1=new ArrayList<String>();
		A1.add("Gouri");
		A1.add("Revti");
		A1.add("Depali");
		System.out.println("Bhavachi atachi list"+A1);
		System.out.println("After getting new bike some new element add in list");
		A1.add("piya");
		A1.add("aarti");
		System.out.println("Bhavachi after bike wali lise"+A1);
		for(String Akash:A1)
		{
			System.out.println(Akash);
		}
		System.out.println("After bhandna");
		A1.remove("aarti");
		System.out.println("list is "+A1);
		System.out.println("Gharat mahit zla list is");
		A1.clear();
		System.out.println("bhavachi list "+A1);
	}
}