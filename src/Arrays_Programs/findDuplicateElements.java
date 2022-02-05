package Arrays_Programs;

public class findDuplicateElements 
{
	public static void main(String[] args)
	{
		int num[] ={1,4,6,3,4,7,8,3,6,9};
		
		System.out.println("Duplicate values are");
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(" " +num[j]);
				}
			}
		}
	}
}
