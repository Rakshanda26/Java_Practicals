import javax.swing.*;
class Divisible
{
public static void main(String [] args)
{
//String ch=JOptionPane.showInputDialog("Press A for divible number\n Press B for not divible number");
String num=JOptionPane.showInputDialog("Enter any number");
	           int i=Integer.parseInt(num);
	int m=i%10;
    if(i<=40)
	{
	       switch (m)
		   
	       {
	       case 0:System.out.println(" Entered number is divible by 10 ");
	             break;
				 
	       case 1:System.out.println(" Entered number is not divisible by 10 "); 
                  break;	
				  
           default:System.out.println("Not divisible ");
	       }
	}
	else
	{
		System.out.println("Enter number is greater than 40 ");
	}
}
}