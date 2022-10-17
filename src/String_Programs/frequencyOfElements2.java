package String_Programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class frequencyOfElements2 
{
	public void freqElements(String str)	
	{
		String[] s=str.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String word:s)
		{
			if(map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
				System.out.println(entry.getKey()+"-"+entry.getValue());
		
	}
	
	@Test
	public void test()
	{
		String str="Hello how are you are you ok today";
		freqElements(str);
	}
}
