package String_Programs;

import java.util.Arrays;

public class removeDuplicates 
{
	static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
       for(int i=0;i<n;i++)
       {
    	   int j;
    	   for(j=0;j<i;j++)
    	   {
    		   if(str[i]==str[j])
    		   {
    			   break;
    		   }
    	   }
    	   if(i==j)
    	   {
    		   str[index]=str[i];
    	   }
       }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 
    // Driver code
    public static void main(String[] args)
    {
        char str[] = "hello have a nice day".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
	
}
