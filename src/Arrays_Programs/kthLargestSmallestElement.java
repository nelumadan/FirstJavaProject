package Arrays_Programs;

public class kthLargestSmallestElement 
{
	static void sort(int arr[])
	{
		int temp=0;
		int n= arr.length;
		
		while (n>0)
		{
			for(int i=0;i<n-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			n--;
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
		int[] arr = {2,4,5,1,67,90,100,10,3};
        int k = 5;
        
        System.out.println("Unsorted array:");
        print(arr);
        System.out.println();
        System.out.println("Sorted array:");
        sort(arr);
        print(arr); 
        System.out.println();
        System.out.println("The " +k+"th smallest element is: " +arr[k-1]);
        System.out.println("The " +k+"th largest element is: " +arr[arr.length-k]);
	}
}

