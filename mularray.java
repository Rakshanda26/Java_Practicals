class Mtest
{
	public static void main(String [] args)
	{
		int a[][]={{3,4,5},{3,4,5},{5,7,9},{2,2,2}};
		int b[][]={{3,4,5},{3,4,5},{5,7,9},{2,2,3}};
		int c[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<4;i++)
		{
		 for(int j=0;j<3;j++)
		 {
			for(int k=0;k<3;k++)
			{
				//c[i][j]+=a[i][k]*b[k][j];
				sum=sum+a[i][k]*b[k][j];
			}
			c[i][j]=sum;
			sum=0;
			System.out.print(c[i][j]+" ");
		 }
		 System.out.println();
		}
	}
}