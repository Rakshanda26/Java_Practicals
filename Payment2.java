import java.util.*;
class htest
{
	public static void main(String [] args)
	{
		HashSet<String>H1=new HashSet<String>();
		H1.add("Raghini");
		H1.add("Sadhana");
		H1.add("Tanuja");
		H1.add("Suvarna");
		System.out.println(H1);
		
		System.out.println(H1.size());
		
		H1.remove("Tanuja");
		System.out.println(H1);
		
		H1.removeIf(Str->Str.contains("Sadhana"));
		System.out.println(H1);
		
		H1.add("Anupama");
		System.out.println(H1);
		
		H1.add("Kavya");
		System.out.println(H1);
	}
}