class Employ
{
private int empid;
private String name;
static String city="Kolhapur";
static String cname="SLK";


public static void change()
	{
	city="pune";
	}
public Employ(int ei,String nm)
{
	name=nm;
	empid=ei;
}
public void showdata()
{
System.out.println("name is "+name);
System.out.println("empid is "+empid);
System.out.println("city is "+city);
System.out.println("company name is "+cname);
}
}

class Etest
{
public static void main(String [] args)
{
	Employ.change();
	Employ E1=new Employ(1001,"Raksha");
	E1.showdata();
	
	Employ E2=new Employ(1002,"Suraj");
	E2.showdata();	
}
}


