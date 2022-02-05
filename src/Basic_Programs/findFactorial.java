package Basic_Programs;

import java.util.Scanner;

public class findFactorial 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int factorial=1;
		
		while(number>1)
		{
			factorial=factorial*number;
			number--;
		}
		System.out.println("The factorial of given number is :" +factorial);
	}
}
