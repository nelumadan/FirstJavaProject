package String_Programs;

import java.util.Scanner;

public class countWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();
		int count=1;
		
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)==' ' && string.charAt(i+1)!=' ')
				count++;
		}
		
		System.out.println("There are " +count+ " words in the string");
	}
}
