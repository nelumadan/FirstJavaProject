package Arrays_Programs;

public class findSumOfElements 
{
	public static void main(String[] args) 
	{
		int num[] = {3,5,6,2,7,9,2};
		int sum = 0;
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("The sum of elements is: " +sum);
	}
}
