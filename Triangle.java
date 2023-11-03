class Triangle
{
	private int b,h,a,c;
	//private int h;
	//private int a;
	//private int c;
	
	public Triangle(int bredth,int height,int side1,int side2)
	{
		b=bredth;
		h=height;
		a=side1;
		c=side2;
	}
	
	public void Value()
	{
		int a=(b*h)/2;
		int p=a*b*c;
		System.out.println("Area of the triangle is "+a);
		System.out.println("Perimeter of the triangle is "+p);
	}
}
class Test
{
	public static void main(String[]args)
	{
		Triangle T1=new Triangle(6,8,20,20);
		T1.Value();
	}
}