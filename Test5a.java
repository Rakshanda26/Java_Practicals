import javax.swing.*;
class Read
{
   public static void main(String [] args)
	{

	String num=JOptionPane.showInputDialog("Enter the number");
		int n=Integer.parseInt(num);
		int i=1;
		while(i<=10)
		{
			System.out.println(i*n);
			i++;
		}
}
}