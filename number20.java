class Atest
{
	static void count(int arr[])
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==20)
			{
				c++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("total element in array "+c);
	}
	
	public static void main(String [] args)
	{
		int a[]={20,7,44,20,7,20};
		count(a);
	}
	
}
