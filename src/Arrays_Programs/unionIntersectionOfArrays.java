package Arrays_Programs;

public class unionIntersectionOfArrays 
{
	static int[] union(int arr1[],int arr2[])
	{
		
		int n1=arr1.length;
		int n2=arr2.length;
		
		int union[]=new int[n1+n2];
		for(int i=0;i<n1;i++)
		{
			union[i]=arr1[i];
		}
		for(int i=0;i<n2;i++)
		{
			union[n1]=arr2[i];
			n1++;
		}
		return union;
	}
	
	static void intersection(int arr1[],int arr2[])
	{
		int n1=arr1.length;
		int n2=arr2.length;
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr2[j]==arr1[i])
				{
					System.out.print(arr2[j] +" ");
				}
			}
		}
	}
	
	static void print(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr1[]= {4,3,2,6,13,5,9,5,10,1};
		int arr2[]= {3,4,7,8,9,2};
		
		System.out.println("First array :");
		print(arr1);
		
		System.out.println();
		System.out.println("Second array :");
		print(arr2);
		
		System.out.println();
		System.out.println("Union of both array :");
		print(union(arr1, arr2));
		
		System.out.println();
		System.out.println("Intersection of both array :");
		intersection(arr1,arr2);
	}
}
