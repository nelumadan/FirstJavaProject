package Basic_Programs;

import java.util.Scanner;

public class countDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int count=0;//one way
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The number of digits in the number is :" +count);
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));//second way
//		System.out.println("The number of digits in the number is :" +sb.length());
	}
}
