import javax.swing.*;
class Box
{
private int l;
private int b;
private int h;

public void setdata()
{
String len=JOptionPane.showInputDialog("Enter the lenght");
		l=Integer.parseInt(len);
String bre=JOptionPane.showInputDialog("Enter the bredth");
	    b=Integer.parseInt(bre);
String het=JOptionPane.showInputDialog("Enter the height");
	    h=Integer.parseInt(het);	
}
public void showdata()
{
	System.out.println("Lenght of the box is "+l);
	System.out.println("Bredth of the box is "+b);
	System.out.println("Height of the box is "+h);
}
public int Volume()
{
		int Vol=l*b*h;
		System.out.println("Volume of the box is "+Vol);
		return Vol;
}
}
class Btest
{
	public static void main(String [] args)
	{
		Box B1=new Box();
		B1.setdata();
		B1.showdata();
		int Vb1=B1.Volume();
		
		Box B2=new Box();
		B2.setdata();
		B2.showdata();
		int Vb2=B2.Volume();
		
		int V=Vb1+Vb2;
		System.out.println("Addition of the volume of the two boxses is "+V);
	}
}