package String_Programs;

import java.util.Arrays;

public class removeDuplicates 
{
    public static void main(String[] args)
    {
        String str = "hello have a nice day";
        char string[] = str.toCharArray();  
        int count;
        
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++)
        {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
            {  
                if(string[i] == string[j] && string[i] != ' ') 
                {  
                    count++;   
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count==1)
                System.out.print(string[i]);  
        }  
    }
	
}
