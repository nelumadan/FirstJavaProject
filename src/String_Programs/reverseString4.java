package String_Programs;

public class reverseString4
{
	public static void main(String[] args)
	{
		String string = "Good Evening";
		StringBuffer sb = new StringBuffer(string);
		
		System.out.println("The string is : " +string);
		String reverse=sb.reverse().toString();
		System.out.println("Reverse string is :" +reverse);
	}
}
