package String_Programs;

public class reverseString1 
{
	public static void main(String[] args) 
	{
		String string1 = "white box testing";
		char string[] = string1.toCharArray();//converts string to char array
		
		int start=0;
		int end=string.length-1;
		char temp='0';
		
		while(start<end)
		{
			temp=string[start];
			string[start]=string[end];
			string[end]=temp;
			start++;
			end--;
		}
		System.out.println("The string is :" +string1);
		System.out.println("The reverse string is :" +String.copyValueOf(string));//converts char array back to string
	}
}
