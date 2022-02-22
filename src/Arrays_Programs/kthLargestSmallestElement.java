package Arrays_Programs;

public class kthLargestSmallestElement 
{
	static int kthSmallest(int arr[],int k)
	{
		int temp=0;
		int n= arr.length;
		
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[k-1];
	}
	static int kthLargest(int arr[],int k)
	{
		int temp=0;
		int n= arr.length;
		
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[k-1];
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
		int[] arr = {2,4,5,1,67,90,100,10,3,12};
        int k = 5;
        print(arr);
        System.out.println();
        System.out.println("The " +k+"th smallest element is: "+kthSmallest(arr,k));
        System.out.println("The " +k+"th largest element is: "+kthLargest(arr,k));
	}
}

