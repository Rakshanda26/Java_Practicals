class Atest
{
	static void minimum(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("minimum element in array"+min);
		
	}
public static void main(String [] args)
{
	int a[]={10,5,15,3,19};
	minimum(a);
}
}