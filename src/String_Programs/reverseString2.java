package String_Programs;

public class reverseString2 {

	public static String reverseString(String str)
	{
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseString=reverseString+str.charAt(i);
		}
		
		return reverseString;
	}
	
	public static void main(String[] args) 
	{
		String string="hello how are you";
		System.out.println("The reverse string is: " +"\n" +reverseString(string));
		
	}
}
