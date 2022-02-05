package String_Programs;

public class countCharacterOccurence 
{
	public static void main(String[] args) 
	{
		String ch="J";
		String s1="Java Programming Java Oops";
		int l1=s1.length();
		
		String s2=s1.replaceAll(ch, "");
		int l2=s2.length();
		
		int count=l2-l1;
		System.out.println(ch+ " occurs " +count+ " times in the string");
	}
}
