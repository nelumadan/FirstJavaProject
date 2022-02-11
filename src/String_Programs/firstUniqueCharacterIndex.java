package String_Programs;

import java.util.Scanner;

public class firstUniqueCharacterIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String\n");
        String s =sc.nextLine();
        
        char[] string=s.toCharArray();
        int[] freq = new int[s.length()];
        
        for(int i=0;i<string.length;i++)
		{
			int count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					count++;
					freq[j]=1;
				}
			}
			if(string[i]!=' ' && freq[i]==0 && count==1)
			{
				System.out.print("First unique character "+string[i] +" is at index " +i);
				break;
			}
		}
	}
}
