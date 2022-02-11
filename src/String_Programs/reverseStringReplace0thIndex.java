package String_Programs;

public class reverseStringReplace0thIndex 
{
	public static void main(String[] args) 
	{
		String string = "GOOD MORNING";
		
//		String reverse="";//1st method to reverse a string
//		char str[]= string.toCharArray();
//		for (int i=str.length-1;i>=0;i--)
//		{
//			reverse=reverse+str[i];
//		}
//		StringBuffer sb = new StringBuffer(reverse);
		
		
		StringBuffer sb = new StringBuffer(string);//2nd method to reverse a string
		StringBuffer reverse=sb.reverse();
		
		
		char ch = reverse.charAt(0);
		if(Character.isLowerCase(ch))
			sb.setCharAt(0, Character.toUpperCase(ch));
			else if(Character.isUpperCase(ch))
				 sb.setCharAt(0, Character.toLowerCase(ch));
		
		System.out.println("Reverse string after replacing 0th index character is: " +sb);
		
	}
}
