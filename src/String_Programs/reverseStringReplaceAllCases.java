package String_Programs;

public class reverseStringReplaceAllCases 
{
	public static void main(String[] args)
	{
		String string = "Hello ALL";
		String reverse = "";
		System.out.println("The original string is :" +string);
		
		char str[] = string.toCharArray();
		
		for(int i=str.length-1;i>=0;i--)
		{
			reverse=reverse+str[i];
		}
		System.out.println("The reversed string is :" +reverse);
		
		StringBuffer sb = new StringBuffer(reverse);
		for(int i=0;i<sb.length();i++)
		{
			if(Character.isLowerCase(reverse.charAt(i)))
				sb.setCharAt(i, Character.toUpperCase(reverse.charAt(i)));
			else if(Character.isUpperCase(reverse.charAt(i)))
				sb.setCharAt(i, Character.toLowerCase(reverse.charAt(i)));	
		}
		System.out.println("The reversed string after swithing the case is :" +sb);
	}
}
