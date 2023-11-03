class Textarea
{
	private int l,b,h;
	public void setdata(int x)
	{
		l=x;
		b=x;
		h=x;
	}
	public void area()
	{
		int a=l*b*h;
		System.out.println("Area of the box is "+a);
	}
}
class Circle extends Textarea
{
	int r;
	public void setdata(int x)
	{
		super.setdata(x);
		r=x;
	}
	public void area()
	{
		super.area();
		double a=3.14*r*r;
		System.out.println("Area of the circle is "+a);
	}
}
class Test
{
	public static void main(String [] args)
	{
		Circle C1=new Circle();
		C1.setdata(5);
		C1.area();
		
		//Textarea T1=new Textarea();
		//T1.setdata(10);
		//T1.area();
	}
}