package Arrays_Programs;

public class elementOccurrenceCount 
{
	static void count(int arr[], int num)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				count++;
		}
		System.out.println();
		System.out.println("The element " +num+ " occured " +count+ " times in the array.");
	}
	
	static void print(int arr[])
	{
		System.out.println("The array is: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {10,2,30,20,2,30,10,4,2,10,4,10,30};
		int num=30;
		print(arr);
		count(arr,num);
	}
}
