import javax.swing.*;
class Box
{
private int len,bre,het;
public void setdata()
{
String l=JOptionPane.showInputDialog("Enter the value of lenght");
	 len=Integer.parseInt(l);
String b=JOptionPane.showInputDialog("Enter the value of bredth");
		 bre=Integer.parseInt(b);
String h=JOptionPane.showInputDialog("Enter the value of height");
		 het=Integer.parseInt(h);
}
public void showdata()
{
System.out.println("Length of box"+len);
System.out.println("bredth of box"+bre);
System.out.println("height of box"+het);
}
public int volume()
{
int v=len*bre*het; 
return v;
}
}
class Vtest
{
public static void main(String[]args)
{
Box B1;
B1=new Box();
B1.setdata();
B1.showdata();
B1.volume();
int vb1=B1.volume();
System.out.println("volume of Box B1 is  "+vb1);

Box B2;
B2=new Box();
B2.setdata();
B2.showdata();
B2.volume();
int vb2=B2.volume();
System.out.println("volume of Box B2 is  "+vb2);
int vb=vb1+vb2;
System.out.println("Addition of volume of two box"+vb);

}
}
