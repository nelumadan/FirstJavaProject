package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) 
	{
		String[] string = {"java", "c", "java", "c++", "python", "java", "python", "c"};
		int count=0;
		int freq[] = new int[string.length];
		
		
		for(int i=0;i<string.length;i++)
		{
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					count++;
					freq[j]=1;
				}
			}
			
			if(freq[i]==0 && count>1)
				System.out.println(string[i] +"-"+ count);
		}
	}
}
