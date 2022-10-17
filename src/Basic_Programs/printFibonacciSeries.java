package Basic_Programs;

import java.util.Scanner;

public class printFibonacciSeries 
{
	public static void printFibonacci(int n)
	{
		int num1=0;
		int num2=1;

		System.out.print(num1 +" " +num2);
		while(n>2)
		{
			int num3=num1+num2;
			System.out.print(" " +num3);
			num1=num2;
			num2=num3;
			n--;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers you want to print in the series?");
		int n=sc.nextInt();
		
		printFibonacci(n);
	}
}
