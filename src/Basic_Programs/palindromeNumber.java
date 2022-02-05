package Basic_Programs;

import java.util.Scanner;

public class palindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int num = sc.nextInt();
		int rev=0;
		int temp=num;
		
		while(temp!=0)
		{
			rev=rev*10 + temp%10;
			temp=temp/10;
		}
		
		if(rev == num)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
	}
}
