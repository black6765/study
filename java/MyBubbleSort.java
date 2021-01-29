public class MyBubbleSort 
{
	public static void main(String [] args)
	{
		int[] arr = new int[] {1,2,5,8,7,4,15,24,3,4};
		int temp;
		
		for (int i = 0; i < arr.length - 1; i++)
		{
			for(int j = 0; j < arr.length - 1 - i; j++)
			{
				if (arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}