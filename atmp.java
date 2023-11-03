import javax.swing.*;
class Atm
{
public static void main(String [] args)
{
	int bal=3000;
	String ch=JOptionPane.showInputDialog("Press D for deposite\n Press W for withdraw\n Press B for balance\n Press E for exit");
	switch (ch)
	{
	case "D":String damt=JOptionPane.showInputDialog("Enter the amount for deposite");
			 int da=Integer.parseInt(damt);
		     bal=bal+da;
			 System.out.print("The amount after deposite is "+da + " bal is "+bal);
			 break;
	case "W":String wamt=JOptionPane.showInputDialog("Enter the amount for withdraw");
			 int wa=Integer.parseInt(wamt);
			        if(wa>bal)
					 {
						System.out.print("Insufficient balance");						
					 }
					 else
				     {
						bal=bal-wa;
						System.out.print("The amount after withdraw is "+wa +" bal is "+bal);
					 }
					 break;
	case "B":System.out.print("Your balance is "+bal);
			break;
	case "E":System.out.print("Thank you visit again");
			     break;
    default:System.out.print("Error");
	}
	
}
}