class Mobile
{
private String name;
private String modelname;
private String colour;
private int price;

public void setdata(String nm,String mn,String clr,int p)
{
	name=nm;
	modelname=mn;
	colour=clr;
	price=p;
}
public void showdata()
{
System.out.println("name of mobile is "+name);
System.out.println("modelname mobile is "+modelname);
System.out.println("colour of mobile is "+colour);
System.out.println("price of mobile is "+price);
}
}
class Stest
{
public static void main(String[]args)
{
Mobile M1;
M1=new Mobile( );
M1.setdata("redmi","redminote8","white",20000);
M1.showdata();

Mobile M2;
M2=new Mobile();
M2.setdata("redmi","redminote9","black",25000);
M2.showdata();
}
}

