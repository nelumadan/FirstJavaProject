package Arrays_Programs;

public class printReverseArray 
{
	public static void main(String[] args)
	{
		int arr[] = {2,4,6,8,10,12,14};
		//int temp = arr[0];
		
		System.out.println("The list before reverse is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " +arr[i]);
		}
		
		System.out.println();
		System.out.println("The list after reverse is: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(" " +arr[i]);
		}
	}
}
