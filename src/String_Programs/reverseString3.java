package String_Programs;

public class reverseString3 
{
	public static void main(String[] args) 
	{
		String string = "Good Morning";
		String reverse="";
		char str[]=string.toCharArray();
		int length=str.length;
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+str[i];
		}
		System.out.println("The string is :" +string);
		System.out.println("Reverse string is :" +reverse);
	}
}
