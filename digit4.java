import javax.swing.*;
class digitsep
{
public static void main(String[]args)
{
String num=JOptionPane.showInputDialog("Enter the number");
	int n=Integer.parseInt(num);
	int a=n%10;    //2
	int b=n/10;   //543
	int c=b%10;  //3
	int d=b/10; //54
	int e=d%10;  //4
	int f=d/10; //5
	int g=a+e;
	int h=c+e;
System.out.println("first digit is " +a);
System.out.println("second digit is "+c);
System.out.println("third digit is "+e);
System.out.println("last digit is "+f);
System.out.println("addition is "+g);
System.out.println("addition is "+h);
}
}
