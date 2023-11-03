import javax.swing.*;
class Payment
{
public static void main(String[]args)
{
String ename=JOptionPane.showInputDialog("Enter the employee name ");
String wday=JOptionPane.showInputDialog("Enter the working days ");
	int wd=Integer.parseInt(wday);
String wages=JOptionPane.showInputDialog("Enter the wages ");
	int wg=Integer.parseInt(wages);
	int pay=wd*wg;
System.out.println("employee name is "+ ename+"working days are "+wd +"wages is "+wg);
System.out.println("payment is "+pay);
}
}