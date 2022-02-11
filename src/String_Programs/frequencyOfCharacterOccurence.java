package String_Programs;

import java.util.Scanner;

public class frequencyOfCharacterOccurence 
{
	    public static void main(String args[]) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a string");
	    	String str = sc.nextLine();  
	        int[] freq = new int[str.length()];    
	          
	        //Converts given string into character array  
	        char string[] = str.toCharArray();  
	          
	        System.out.println("Characters and their corresponding frequencies");
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
				if(string[i]!=' ' && freq[i]==0)
				{
					System.out.print(string[i] +"-"+ count +"  ");
				}
			}
	          
	    }
	}

