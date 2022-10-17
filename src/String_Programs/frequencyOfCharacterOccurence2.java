package String_Programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class frequencyOfCharacterOccurence2 
{
	public void freqElements(String str)	
	{
		char[] s=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:s)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
			if(entry.getKey()!=' ')
				System.out.print(entry.getKey() +"-"+entry.getValue()+" ");
	}
	
	@Test
	public void test()
	{
		String str="Hello how are you";
		freqElements(str);
	}
}
