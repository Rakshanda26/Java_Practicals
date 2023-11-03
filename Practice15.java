class Rectangle
{
	private int length;
	private int bredth;
	private int height;
	
	public Rectangle(int l,int b,int h)
	{
		length=l;
		bredth=b;
		height=h;
	}
	public void showdata()
	{
		System.out.println("Length is "+length);
		System.out.println("bredth is "+bredth);
		System.out.println("height is "+height);
	}
	public void area()
	{
		int a=length*bredth*height;
		System.out.println("area of the rectangle is "+a);
		int p=2*(length+bredth);
		System.out.println("perimeter of the rectangle is "+p);
	}
	
}
class Rtest
{
	public static void main(String[]args)
	{
		Rectangle R1=new Rectangle(5,7,8);
		//R1.setdata(5,4,8);
		R1.showdata();
		R1.area();
	}
	
}