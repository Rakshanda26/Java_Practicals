class Manus
{
	private String name;
	private String city;
	
	public Manus()
	{
		name="raksha";
		city="kolhapur";
	}
	public void showdata()
	{
		System.out.println("name is "+name);
		System.out.println("city is "+city);
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