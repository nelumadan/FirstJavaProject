package String_Programs;

import java.util.Scanner;

public class palindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check");
		String string=sc.nextLine();
		String reverse="";
		int length=string.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		
		if(reverse.equals(string))
			System.out.println("The string is a palindrome");
		else
			System.out.println("The string is not a palindrome");
	}
}
