import javax.swing.*;
class Year
{
	public static void main(String [] args )
	{
		String Year=JOptionPane.showInputDialog("Enter the year");
			int y=Integer.parseInt(Year);
			
		if(y%4==0)
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
	}
}