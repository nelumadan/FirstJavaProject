package Arrays_Programs;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class FindTwoSum1 
{
	public int[] findTwoSum(int[] array, int target)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==target)
				{
					return new int[] {i,j};
				}	
			}
		}
		return null;
	}
	
	public void print(int[] result)
	{
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void test()
	{
		int[] arr= {1,2,3,5,6,7,9,11,17,19};
		int target=20;
		print(findTwoSum(arr,target));
	}
	
}
