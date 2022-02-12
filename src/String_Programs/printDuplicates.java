package String_Programs;

import java.util.HashSet;

public class printDuplicates 
{
	public static void main(String[] args) 
	{
		String string = "hello everybody how are you";
		char[] str=string.toCharArray();
		int count;
		HashSet<Character> duplicate = new HashSet<Character>();
		
		for(int i=0;i<str.length;i++)
		{
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j] && str[i] !=' ')
				{
					count++;
				}
			}
			if(count>1 && duplicate.add(str[i])==true)
			{
				System.out.print(str[i]+" ");
			}
		}
	   }  
}

