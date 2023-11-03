import javax.swing.*;
class Calculator
{
public static void main(String[] args)
{
	String num1=JOptionPane.showInputDialog("Enter number1");
	String num2=JOptionPane.showInputDialog("Enter number2");
	String ch=JOptionPane.showInputDialog("Press A for additon\n Press S for substraction\n Press M for multiplication\n Press D for division");
	switch (ch)
	{
	case "A":int a1=Integer.parseInt(num1);
		     int b1=Integer.parseInt(num2);
		     int c1=a1+b1;
			 System.out.print("Addition is "+c1);
			 break;
	case "S":int a2=Integer.parseInt(num1);
	         int b2=Integer.parseInt(num2);
			 int c2=a2-b2;
			 System.out.print("Substraction is "+c2);
			 break;
    case "M":int a3=Integer.parseInt(num1);
	         int b3=Integer.parseInt(num2);
			 int c3=a3*b3;
			 System.out.print("Multiplication is "+c3);
			 break;
	case "D":int a4=Integer.parseInt(num1);
	         int b4=Integer.parseInt(num2);
			 int c4=a4/b4;
			 System.out.print("Division is "+c4);
			 break;
    default:System.out.print("Error");
		 
	}
}
}