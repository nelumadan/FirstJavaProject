package String_Programs;

public class countCharacterOccurence 
{
	public static void main(String[] args) 
	{
		String string="Java Programming Java Oops";
		char ch='a';
		int count=0;
		
		char[] str=string.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==ch)
				count++;
		}
		
		System.out.println("The character " +ch+ " occurs " +count+ " times in the string.");
	}
}
