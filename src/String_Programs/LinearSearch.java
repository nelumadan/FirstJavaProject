package String_Programs;

import org.testng.annotations.Test;

public class LinearSearch 
{
	static void search(String s,char c)
	{
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==c)
			{
				System.out.println("Element is found at " +i +" index position");
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Element is not found");
	}
	
	@Test
	public void stringSearch()
	{
		String s="hello how are you";
		char c='o';
		search(s,c);
	}
}
