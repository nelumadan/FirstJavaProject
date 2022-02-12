package String_Programs;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates 
{
    public static void main(String[] args)
    {
    	String string = "hello everybody how are you";
		char[] str=string.toCharArray();
		int count;
		
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
			if(count==1)
			{
				System.out.print(str[i]+" ");
			}
		}
    }
	
}
