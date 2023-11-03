class Box
{
	private int length;
	private int bredth;
	private int height;
	
	public void setdata(int ln,int bre,int het)
	{
		length=ln;
		bredth=bre;
		height=het;
	}
	public void showdata()
	{
		System.out.println("length is "+length);
		System.out.println("bredth is "+bredth);
		System.out.println("height is "+height);
	}
	public int volume()
	{
		int vol=length*bredth*height;
		System.out.println("Volume of the box is "+vol);
		return vol;
	}
}
class Btest
{
	public static void main(String [] args)
	{
	Box B1=new Box();
	B1.setdata(10,20,30);
	B1.showdata();
	int v1=B1.volume();
	
	Box B2=new Box();
	B2.setdata(30,40,20);
	B2.showdata();
	int v2=B2.volume();
	int v=v1+v2;
	System.out.println("Addition of volume of the two boxses ");
	}
}