import javax.swing.*;
class Digit
{
public static void main(String [] args)
{
String num=JOptionPane.showInputDialog("Enter the number");
	int n=Integer.parseInt(num);
	int a=n%10;
	int b=n/10;
	int c=b%10;
	int d=b/10;
	int e=d%10;
	int f=d/10;
	System.out.println("First digit is "+a);
	System.out.println("Second digit is "+c);
	System.out.println("Third digit is "+e);
	System.out.println("Last digit is "+f);
	
}
}