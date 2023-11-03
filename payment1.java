import javax.swing.*;
class Employee
{
private String enm;
private int wages,wdays;
public void setdata()
{
enm=JOptionPane.showInputDialog("Enter the employee name");
String wg=JOptionPane.showInputDialog("Enter the wages");
		 wages=Integer.parseInt(wg);
String wd=JOptionPane.showInputDialog("Enter the working days");
		 wdays=Integer.parseInt(wd);
}
	//ename=enm;
	//wages=wg;
	//wdays=wd;
public void showdata()
{
System.out.println("Name of employee "+enm);
System.out.println("wages of employee "+wages);
System.out.println("working days of employee "+wdays);
}
public double Payment()
{
	double pay=wages*wdays;
	if(pay>25000)
	{
	double Fpay=pay*0.82;
	double Gpay=pay*0.18;
	System.out.println("Final payment is "+Fpay);
	System.out.println("amout of gst is "+Gpay);
	return pay;
	}
	else
	{
	System.out.println("payment is "+pay);
	return pay;
	}	
}
}
class Etest
{
public static void main(String [] args)
{
	Employee E1;
	E1=new Employee();
	E1.setdata();
	E1.showdata();
	E1.Payment();
	double p1=E1.Payment();
	System.out.println("Payment of employee1 is"+p1);
	
	Employee E2;
	E2=new Employee();
	E2.setdata();
	E2.showdata();
	E2.Payment();
	double p2=E2.Payment();
	System.out.println("Payment of employee2 is"+p2);
	
	Employee E3;
	E3=new Employee();
	E3.setdata();
	E3.showdata();
	E3.Payment();
	double p3=E3.Payment();
	System.out.println("Payment of employee3 is"+p3);
	
double p=p1+p2+p3;
System.out.println("Addition of 3 is "+p);
}
} 