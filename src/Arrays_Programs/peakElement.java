package Arrays_Programs;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class peakElement 
{
	public ArrayList<Integer> findPeak(int[] arr)	
	{
		ArrayList<Integer> peakElements= new ArrayList<Integer>();
		
		int n=arr.length-1;
		if(arr.length==1)
			peakElements.add(arr[0]);
		if(arr[0]>arr[1])
			peakElements.add(arr[0]);
		if(arr[n]>arr[n-1])
			peakElements.add(arr[n]);
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
				peakElements.add(arr[i]);
		}
		return peakElements;
	}
	
	public void print(int[] arr)
	{
		for(int num:arr)
			System.out.print(num +" ");
	}
	@Test
	public void test()
	{
		int[] arr= {3,67,23,11,4,90,2,35,56,45,25};
		System.out.println(findPeak(arr));
	}
}
