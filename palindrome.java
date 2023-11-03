import javax.swing.*;
class Ptest
{
	public static void main(String [] args)
	{
		String num=JOptionPane.showInputDialog("Enter the number");
			int n=Integer.parseInt(num);
		int r,sum=0;
		int t;
		t=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(t==sum)
		{
			System.out.println("Given no is palindrome");
		}
		else
		{
			System.out.println("Given no is not palindrome");
		}
	}
}