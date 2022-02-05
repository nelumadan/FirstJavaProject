package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListDemo2_convertingArrayToArrayList 
{
	public static void main(String[] args)
	{
		String arr[]= {"Dog","Cat","Elephant","Horse"};
		System.out.println("Elements of array:");
		for(String value:arr)
		{
			System.out.print(value +" ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		ArrayList al=new ArrayList(Arrays.asList(arr));//converting above array into arraylist
		System.out.println("Elements of arraylist:");
		for(Object element:al)
		{
			System.out.print(element +" ");
		}
	}
}
