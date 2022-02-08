package Basic_Programs;

public class twoForLoopAssignment 
{
	public static void main(String[] args) 
	{
		int n = 1;
		for (int i=1; i<=5;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print(j +" ");
			}
			n++;
			System.out.println();
		}
	}
}
