package Basic_Programs;
import java.util.*;

public class findSumOfInputNumbers 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Enter " +n+" numbers");
		for(int i=0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("The numbers are");
		for(int j=0;j<num.length;j++)
		{
			System.out.print(" " +num[j]);
		}
		for(int k=0;k<num.length;k++)
		{
			sum = sum + num[k];
		}
		System.out.println();
		System.out.println("The sum of the numbers is: " +sum);
	}
}
