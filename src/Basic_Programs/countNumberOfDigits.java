package Basic_Programs;

import java.util.Scanner;

public class countNumberOfDigits 
{
	public static int countDigits(int num)
	{
		int count=0;//one way
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("The number of digits in the number is :" +countDigits(num));
	}
}
