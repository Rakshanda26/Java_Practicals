class Manus
{
private String name,city;
public Manus()
{
	name="Raksha";
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

