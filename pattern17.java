class Print
{
public static void main(String[]args)
{
	for(int n=97;n<=101;n++)
	{
		for(int i=101;i>=n;i--)
		{
		System.out.print((char)i+" ");
		}
		System.out.println();
		
	}
}
}