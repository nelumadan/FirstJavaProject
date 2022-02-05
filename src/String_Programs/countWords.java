package String_Programs;

import java.util.Scanner;

public class countWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.nextLine();
		char str[] = string.toCharArray();
		int count=1;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==' ' && str[i+1]!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of words in the string is :" +count);
	}
}
