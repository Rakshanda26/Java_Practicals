import javax.swing.*;
class SPtest
{
	public static void main(String [] args )
	{
		String s=JOptionPane.showInputDialog("Enter the Sting ");
		//String s="vishal";
		String r="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r))
		{
			System.out.println("Given string "+s+" is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}
}
