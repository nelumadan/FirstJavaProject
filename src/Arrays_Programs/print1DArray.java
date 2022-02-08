package Arrays_Programs;

public class print1DArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {4,5,7,8,6,3,9};
		
		for(int i=0;i<arr.length;i++)//1st way with using for loop
		{
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		for(int value:arr)//2nd way using advanced for loop
		{
			System.out.print(value +" ");
		}
	}
}
