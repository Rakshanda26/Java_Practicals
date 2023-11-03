import javax.swing.*;
class factorial
{
	public static void main(String [] args)
	{
		String num=JOptionPane.showInputDialog("Enter the number");
			int n=Integer.parseInt(num);
			int sum=1;
		
			for(int i=1;i<=n;i++)
			{
				sum=sum*i;
			}
			System.out.println("sum is "+sum);
	}
}