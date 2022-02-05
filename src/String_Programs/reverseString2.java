package String_Programs;

public class reverseString2 {

	public static void main(String[] args) 
	{
		String string = "black box testing";
		String reverse = "";
		int n = string.length();
		
		for (int i=n-1;i>=0;i--)
		{
			reverse=reverse + string.charAt(i);
		}
		
		System.out.println("String is :" +string);
		System.out.println("Reverse string is :" +reverse);
	}
}
