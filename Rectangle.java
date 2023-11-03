class Rectangle
{
	private int length;
	private int bredth;
	
	public Rectangle(int l,int b)
	{
		length=l;
		bredth=b;
	}
	public void value()
	{
		int a=length*bredth;
		System.out.println("Area of the rectangle is "+a);
		int p=2*(length+bredth);
		System.out.println("Perimeter of the rectangle is "+p);
	}
}

class Rtest
{
	public static void main(String [] args)
	{
		Rectangle R1=new Rectangle(4,8);
		R1.value();
	}
}