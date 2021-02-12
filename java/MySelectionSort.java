public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,5,6,2,4};
		int minidx, temp;
		for (int i = 0; i < arr.length; i++)
		{
			minidx = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[j] < arr[minidx])
				{
					minidx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = temp;
		}
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
