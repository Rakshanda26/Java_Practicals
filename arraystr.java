class Atest
{
	static void people(String [] arr)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
				c++;
				System.out.println(arr[i]);
		}
		System.out.println("total no of people in array "+c);
	}
	
	public static void main(String [] args)
	{
		String a[]={"revti","gouri","depali","reva"};
		people(a);
	}
	
}
