package String_Programs;

public class removeSpaces 
{
	public static void main(String[] args) 
	{
		String str = "Hello            how      are            you?";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
