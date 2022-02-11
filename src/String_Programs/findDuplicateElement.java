package String_Programs;

import java.util.HashSet;

public class findDuplicateElement 
{
	public static void main(String[] args) 
	{
		String[] string = {"java","c","python","java","c++","c","java","python","c#"};
		int count;
		int[] freq=new int[string.length];
		
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
				System.out.println(string[i]);
		}
		
	}
}
