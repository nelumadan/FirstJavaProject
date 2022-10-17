package Arrays_Programs;

import org.testng.annotations.Test;
//for binary search list has to be sorted
public class binarySearchAnElement 
{
	static void search(int[] arr,int element)
	{
		int li=0;
		int hi=arr.length-1;
		boolean flag=false;
		int mi=(li+hi)/2;
		
		while(li<=hi)
		{
			if(arr[mi]==element)
			{
				System.out.println(+element +" is found at " +mi +" index position");
				flag=true;
				break;
			}
			else if(arr[mi]<element)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if (flag==false)
			System.out.println("Element not found");
	}
	
	@Test
	public void arraySearch()
	{
		int[] arr= {1,5,8,10,17,24,35,48,50,63,69,73,80,92};
		int element=92;
		search(arr,element);
	}
}
