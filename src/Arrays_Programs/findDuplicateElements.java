package Arrays_Programs;

import java.util.ArrayList;

public class findDuplicateElements 
{
	public static void main(String[] args)
	{
		int arr[] = {12,56,78,12,78,9,49,34,12,23,45,78,33,12};
		ArrayList duplicate = new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					if(duplicate.contains(arr[j]))
						break;
					else
					{
						duplicate.add(arr[j]);
						break;
					}
				}
				
			}
		}
		
		System.out.println("Duplicate elements are: " +duplicate);
	}
}
