package String_Programs;

import java.util.Scanner;

public class reverseStringWithWordsAndSpaces 
{
	public static void main(String[] args) 	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any sentence");
		String string = sc.nextLine();
		
		String reverse="";
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		
		String[] str=reverse.split(" ");
		String reverseString="";
		for(String word:str)
		{
			String reverseWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+word.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
			
		}
		
		System.out.println(reverseString);
		
		
	}
}
