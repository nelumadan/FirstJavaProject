package Basic_Programs;

import java.util.Scanner;

public class palindromeNumber 
{
	public static void checkIfPalindrome(int num)
	{
		int reverse=0;
		int temp=num;
		
		while(temp!=0)
		{
			reverse=reverse*10 + temp%10;
			temp=temp/10;
		}
		
		if(reverse == num)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int num = sc.nextInt();
		
		checkIfPalindrome(num);
	}
}
