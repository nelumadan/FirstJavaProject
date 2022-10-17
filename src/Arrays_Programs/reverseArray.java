package Arrays_Programs;

import org.testng.annotations.Test;

public class ReverseArray 
{
	static void reverse(int[] arr)
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
	
	static void print(int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	@Test
	public void array()
	{
		int[] arr= {2,3,4,5,6,7,8,9,10,11,12};
		reverse(arr);
		print(arr);
	}
}
