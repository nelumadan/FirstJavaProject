package Arrays_Programs;

public class minMaxElement 
{
	public static void main(String[] args) 
	{
		int arr[] = {2,4,33,7,9,10,1,22};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i:arr)
		{
			if(i<min)
			{
				min=i;
			}
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println("The minimum value is :" +min);
		System.out.println("The maximum value is :" +max);
	}
}
