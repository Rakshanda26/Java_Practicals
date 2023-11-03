import javax.swing.*;
class Calculator
{
public static void main(String[]args)
{
	String ch=JOptionPane.showInputDialog("Press A for addition\n Press S for substraction\n Press M for multiplication\n Press division for D\n Press E for exit");
	switch (ch)
	{

		case "A":String num1=JOptionPane.showInputDialog("Enter the number1 for addition");
				 int a=Integer.parseInt(num1);
				 String num2=JOptionPane.showInputDialog("Enter the number2 for addition");
				 int b=Integer.parseInt(num2);
				 int c=a+b;
				 System.out.print("addition is"+c);
				 break;
				 
	    case "S":String nums1=JOptionPane.showInputDialog("Enter the numbers1 for substraction");
				 int a1=Integer.parseInt(nums1);
				 String nums2=JOptionPane.showInputDialog("Enter the numbers2 for substraction");
				 int b1=Integer.parseInt(nums2);
				 int c1=a1-b1;
				 System.out.print("substraction is"+c1);
				 break;
				 
		case "M":String numm1=JOptionPane.showInputDialog("Enter the numberm1 for multiplication");
				 int a2=Integer.parseInt(numm1);
				 String numm2=JOptionPane.showInputDialog("Enter the numberm2 multiplication");
				 int b2=Integer.parseInt(numm2);
				 int c2=a2*b2;
				 System.out.print("multiplication  is"+c2);
				 break;	
				 
	    case "D":String numd1=JOptionPane.showInputDialog("Enter the numberd1 for division");
				 int a3=Integer.parseInt(numd1);
				 String numd2=JOptionPane.showInputDialog("Enter the numberd2 ");
				 int b3=Integer.parseInt(numd2);
				 int c3=a3/b3;
				 System.out.print("division is"+c3);
				 break;	
        case "E":System.out.print("Exit");	
        default :System.out.print("error");		
	}
}
}