package Arrays_Programs;

public class moveNegativeElements 
{
	public static void main(String[] args) 
	{
		int arr[]= {-1,3,-5,4,-6,-7,2,8,-3,-5,2,6};
		int n=arr.length;
		int i=0;
		int temp=0;
		
		while(i<n)
		{
			if(arr[i]<0)
			{
				temp=arr[i];
				arr[i]=arr[n-1];
				arr[n-1]=temp;
				n--;
			}
			else i++;
		}
		
		System.out.println("The array after moving negative numbers to one side is :");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j] +" ");
		}
	}
}
