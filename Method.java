class Box
{
private int l;
private int b;
private int h;
public void setdata(int length,int bredth,int height)
{
	l=length;
	b=bredth;
	h=height;
}	
public void showdata()
{
System.out.println("Length is "+l);
System.out.println("Bredth is "+b);
System.out.println("Height is "+h);	
}
public int Volume()
{
	int Vol=l*b*h;
	System.out.println("Volume of the box is "+Vol);
	return Vol;
}
}
class Vtest
{
public static void main(String [] args)
{
	Box B1=new Box();
	B1.setdata(10,20,30);
	B1.showdata();
	int Vb1=B1.Volume();
	
	Box B2=new Box();
	B2.setdata(20,30,40);
	B2.showdata();
	int Vb2=B1.Volume();
	
	int V=Vb1+Vb2;
	System.out.println("Addition of volume of two boxses is "+V);
	
}	
}