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
	          
	        for(int i = 0; i <str.length(); i++) {  
	            freq[i] = 1;  
	            for(int j = i+1; j <str.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	          
	        //Displays the each character and their corresponding frequency  
	        System.out.println("Characters and their corresponding frequencies");  
	        for(int i = 0; i <freq.length; i++) {  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.print(string[i] + "-" + freq[i]+ " ");  
	        }  
	    }
	}

