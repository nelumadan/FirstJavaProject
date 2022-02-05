package Arrays_Programs;

public class minMaxElement 
{
	public static void main(String[] args) 
	{
		int arr[] = {2,4,33,7,9,10,1,22};
		int min = arr[0];
		int max = arr[0];
		
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The minimum value is :" +min);
		System.out.println("The maximum value is :" +max);
	}
}
