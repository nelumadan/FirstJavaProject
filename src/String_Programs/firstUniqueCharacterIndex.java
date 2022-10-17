package String_Programs;

import java.util.HashSet;
import java.util.Scanner;

public class firstUniqueCharacterIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String\n");
        String s =sc.nextLine();
        
        char[] string=s.toCharArray();
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i=0;i<string.length;i++)
		{
			int count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					count++;
				}
			}
			if(string[i]!=' ' && hs.add(string[i])==true && count==1)
			{
				System.out.print("First unique character "+string[i] +" is at index " +i);
				break;
			}
		}
	}
}
