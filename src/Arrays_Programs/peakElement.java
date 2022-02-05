package Arrays_Programs;

public class peakElement 
{
	static void findPeak(int arr[])
	{
		int n=arr.length;
		
		if(n==1)
			System.out.println(arr[0]);
		if(arr[0]>=arr[1])
			System.out.println(arr[0]);
		if(arr[n-1]>=arr[n-2])
			System.out.println(arr[n-1]);
		
		{
		for(int i=1;i<n-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
				System.out.print(arr[i] +" ");
		}
		}
	}

	public static void main(String[] args) 
	{
		int arr1[] = {1,4,7,10,6,20,18};
		int arr2[]= {9,6};
		int arr3[]= {45};
		System.out.println("The peak elements in arr1 are: ");
		findPeak(arr1);
		System.out.println();
		System.out.println("The peak elements in arr2 are: ");
		findPeak(arr2);
		System.out.println("The peak elements in arr3 are: ");
		findPeak(arr3);
	}
}
