class Circle
{
private int r;
public Circle(int n)
{
	r=n;
}
public void area()
{
	double a=3.14*r*r;
	System.out.println("Area of circle"+a);
}
}
class Ctest
{
public static void main(String [] args)
{
Circle C1;
C1=new Circle(5);
C1.area();
}
}