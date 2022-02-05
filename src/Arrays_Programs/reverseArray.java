package Arrays_Programs;

public class reverseArray 
{
	static void reverse(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		int temp=0;
		
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {3,6,9,12,15,18,21,24};
		System.out.println("The list before reverse is: ");
		print(arr);
		reverse(arr);
		System.out.println();
		System.out.println("The list after reverse is: ");
		print(arr);
	}
}
