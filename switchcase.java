import javax.swing.*;
class Atm
{
public static void main(String[]args)
{
	int bal=3000;
	String ch=JOptionPane.showInputDialog("Press D for deposite \n Press W for withdraw \n Press B for balance \n Press E for exit");
	switch (ch)
	{
	//case "d":
	case "D": String damt=JOptionPane.showInputDialog("enter amount for deposite");
			  int da=Integer.parseInt(damt);
			  bal=bal+da;
			  System.out.print("after deposite"+da+"balance is"+bal);
			  break;
	
	case "w":
	case "W": String wamt=JOptionPane.showInputDialog("enter amount for withdraw");
			  int wa=Integer.parseInt(wamt);
			  if(wa>bal)
			  {
			  System.out.print("Insufficient balance");
			  }
			  else
			  {
			  bal=bal-wa;
			  System.out.print("after withdraw"+wa+"your balance"+bal);
			  }
			  break;
	//case "B":
	case "b":System.out.print("Your balance is" +bal);
			 break;
    //case "E":
	case "e":System.out.print("thank you visit again");
	         break;
    default:System.out.print("Error");
    }
}
}