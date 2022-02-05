package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo2 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();//declaring hashmap homogenous type
		
		hm.put(101, "John");//adding key-value pairs
		hm.put(102, "David");
		hm.put(103, "Scott");
		hm.put(104, "Mary");
		hm.put(105, "Tye");
		
		//Entry Methods
		//**************************
		for(Map.Entry entry:hm.entrySet())//one way of displaying key value pairs one by one
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());//methods from entry interface
		}
		
		hm.remove(103);//removing entry with key 103
		
		System.out.println(hm);//2nd way of displaying
	}
}
