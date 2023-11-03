class Manus
{
	private String city;
	private String name;

	public Manus()
	{
		city="Kolhapur";
		name="raksha";
		
	}
	public void showdata()
	{
		System.out.println("city is "+city);
		System.out.println("name is "+name);
	}
}
class Mtest
{
public static void main(String[] args )
{
	Manus M1=new Manus();
	M1.showdata();
}
}
