abstract class Circle
{
	int r;
	public void setRadius(int n)
	{
		r=n;
	}
	abstract public void area();
}
class Ncircle extends Circle
{
	public void circum()
	{
		double ci=2*3.14*r;
		System.out.println("circumference of circle "+ci);
	}
	public void area()
	{
		double a=3.14*r*r;
		System.out.println("Area of circle"+a);
	}
}	
class Atest
{
	public static void main(String [] args)
	{
		Ncircle C1=new Ncircle();
		C1.setRadius(5);
		C1.circum();
		C1.area();
	}
}