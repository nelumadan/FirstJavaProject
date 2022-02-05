package String_Programs;

import java.util.Scanner;

public class firstUniqueCharacterIndex 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a String\n");
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println("Original String: " + s);
        System.out.println("Index of first unique character in the above string is : " + first_Uniq_Char(s));
    }
	
    public static int first_Uniq_Char(String s) 
    {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) 
        {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) 
        {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
	}
}
