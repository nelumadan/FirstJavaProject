package Arrays_Programs;

public class sortArray 
{
	static void sort(int arr[])
	{
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {3,1,5,7,2,10,4};
		System.out.println("The array before sorting is : ");
		print(arr);
		sort(arr);
		System.out.println();
		System.out.println("The array after sorting is : ");
		print(arr);
	}
}
