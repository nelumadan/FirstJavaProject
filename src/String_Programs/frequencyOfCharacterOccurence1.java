package String_Programs;

import java.util.HashSet;
import java.util.Scanner;

public class frequencyOfCharacterOccurence1 
{
	    public static void main(String args[]) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a string");
	    	String str = sc.nextLine();  
	    	HashSet<Character> hs = new HashSet<Character>();   
	          
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
					}
				}
				if(string[i]!=' ' && hs.add(string[i])==true)
				{
					System.out.print(string[i] +"-"+ count +"  ");
				}
			}
	          
	    }
	}

