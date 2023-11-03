class Atest
{
	static void maximum (int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}	
		}
		System.out.println("largest element in array "+max);
	}
	
	public static void main(String [] args)
	{
		int a[]={10,5,25,3,19};
		maximum(a);
	}
	
}
