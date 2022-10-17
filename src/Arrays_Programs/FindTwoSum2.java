package Arrays_Programs;

import java.util.HashMap;

import org.testng.annotations.Test;

public class FindTwoSum2 
{
	public int[] findTwoSum(int[] arr,int target)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int diff=target-arr[i];
			if(map.containsKey(diff))
			{
				return new int[]
						{ map.get(diff),i};
			}
			map.put(arr[i], i);
		}
		return null;
	}
	
	public void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
	}
	
	@Test
	public void test()
	{
		int[] arr= {3,2,4,5,8,1,6};
		int target=12;
		print(findTwoSum(arr,target));
		
	}
}
