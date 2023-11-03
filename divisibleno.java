import javax.swing.*;
class Divisible
{
public static void main(String [] args)
{
String ch=JOptionPane.showInputDialog("Press A for number1\n Press B for number2\n Press C for number3\n Press D for number4");
	switch (ch)
	{
	case "A":String num1=JOptionPane.showInputDialog("Enter the number1");
	        int n1=Integer.parseInt(num1);
		    if(n1>=1&&n1<=40)
	        {
			int c1=n1/10;
			System.out.print("number1 is divisible by 10 "+c1);
			}
			else
			{
			System.out.print("number1 is not divisible");
			}
			break;
			
    case "B":String num2=JOptionPane.showInputDialog("Enter the number2");
	        int n2=Integer.parseInt(num2);
		    if(n2>=1&&n2<=40)
	        {
			int c2=n2/10;
			System.out.print("number2 is divisible by 10 "+c2);
			}
			else
			{
			System.out.print("number2 is not divisible");
			}
			break;
			
	case "C":String num3=JOptionPane.showInputDialog("Enter the number3 ");
	       int n3=Integer.parseInt(num3);
		   if(n3>=1&&n3<=40)
	        {
			int c3=n3/10;
			System.out.print("number3 is divisible by 10"+c3);
			}
			else
			{
			System.out.print("number3 is not divisible");
			}
			break;
	case "D":String num4=JOptionPane.showInputDialog("Enter the number4 ");
	       int n4=Integer.parseInt(num4);
		   if(n4>=1&&n4<=40)
	        {
			int c4=n4/10;
			System.out.print("number4 is divisible by 10 "+c4);
			}
			else
			{
			System.out.print("nummber4 is not divisible");
			}
			break;
    default:System.out.println("Error");
	}
}
}