package String_Programs;

import java.util.HashSet;

public class findDuplicateElement 
{
	public static void main(String[] args) 
	{
		String arr[]= {"java","c","c++","python","java","c"};
		
//		System.out.println("The duplicate elements are: ");//first method
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//					System.out.println(arr[j] +" ");
//			}
//		}
		
		
		System.out.println("The duplicate elements are: ");//second method using HashSet
		HashSet<String> temp = new HashSet();
		
		for(String value:arr)//advanced for loop
		{
			if(temp.add(value)==false)
			{
				System.out.println(value);
			}
		}
		
	}
}
