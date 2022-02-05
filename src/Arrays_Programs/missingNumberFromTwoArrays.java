package Arrays_Programs;

public class missingNumberFromTwoArrays 
{
	public static void main(String[] args) 
	{
		int arr1[] = {3,5,4,2,7,8};
		int arr2[] = {3,4,7,8,2};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			sum1=sum1+arr1[i];
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			sum2=sum2+arr2[j];
		}
		
		System.out.println("The missing number from two arrays is :" +(sum1-sum2));
	}
}
