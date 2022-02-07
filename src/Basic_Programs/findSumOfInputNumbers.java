package Basic_Programs;
import java.util.*;

public class findSumOfInputNumbers 
{
	public static void main(String[] args) 
	{
		int i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		System.out.println("Enter " +n+" numbers");
		for(i=0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
		
		System.out.println("The numbers are");
		for(i=0;i<num.length;i++)
		{
			System.out.print(" " +num[i]);
		}
		
		for(i=0;i<num.length;i++)
		{
			sum = sum + num[i];
		}
		
		System.out.println();
		System.out.println("The sum of the numbers is: " +sum);
	}
}
