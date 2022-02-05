package String_Programs;

import java.util.Scanner;

public class reverseEachWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();//original string
		
		String[] words = string.split(" ");//split string into words
		
		String reverseString="";
		
		for(String w:words)
		{
			String reverseWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}
}
