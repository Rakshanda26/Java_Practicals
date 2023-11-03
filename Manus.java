class Manus
{
	private String name;
	private String city;
	private int panno;
	private int ano;
	
	public Manus()
	{
		name="raksha";
		city="Kolhapur";
		panno=347;
		ano=6622;
	}
	
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
		System.out.println("aadhar no is "+ano);
		System.out.println("pan no is "+panno);
	}	
}
class Mtest 
{
public static void main(String [] args)
{
	Manus M1=new Manus();
	M1.showdata();
}
}