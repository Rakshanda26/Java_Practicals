import javax.swing.*;
class Prime
{
	public static void main(String [] args)
	{
		String num=JOptionPane.showInputDialog("Enter the number");
			int n=Integer.parseInt(num);
			if(n%1==1&&n%n==0)
			{
				System.out.println("Number is prime number");
			}
			else
			{
				System.out.println("Number is not prime number");
			}
	}
}