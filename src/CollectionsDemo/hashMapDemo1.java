package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo1 
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();//declaring hashmap
		
		hm.put(101, "John");//adding key-value pairs
		hm.put(102, "David");
		hm.put(103, "Scott");
		hm.put(104, "Mary");
		hm.put(105, "Tye");
		
		System.out.println("Hashmap: " +hm);
		
		hm.put(103, "Nancy");//if duplicate key entered value gets updated for that key
		System.out.println("Hashmap after adding duplicate key: " +hm);
		
		hm.put(106, "David");//can add duplicate value
		System.out.println("Hashmap after adding duplicate value: " +hm);
		
		System.out.println("Value at key 104: " +hm.get(104));
		
		hm.remove(106);//remove pair with key 106
		System.out.println("Hashmap after removing 106 pair: " +hm);
		
		System.out.println("Hashmap contains key 102: " +hm.containsKey(102));//will return true if key 102 is present
		System.out.println("Hashmap contains key 106: " +hm.containsKey(106));//will return false because 106 is removed
		
		System.out.println("Hashmap contains value Nancy: " +hm.containsValue("Nancy"));//will return true if value Nancy is present
		System.out.println("Hashmap contains value Joseph: " +hm.containsValue("Joseph"));//will return false because Joseph is not there
		
		System.out.println("Hashmap is empty: " +hm.isEmpty());//will return false because its not empty
		
		System.out.println("All the keys: " +hm.keySet());//will return all the keys as a set
		
		for(Object obj:hm.keySet())//to print keys one by one, using Object because hm is declared as heterogenous type so all entries are stored as objects
		{
			System.out.println(obj);
		}
		
		for(Object obj:hm.keySet())//to print keys and values one by one
		{
			System.out.println(obj+"  "+hm.get(obj));
		}
		
		System.out.println("All the values: " +hm.values());//will return all the values as a collection
		
		System.out.println("All the entries: " +hm.entrySet());//will return all the entries as a set
	}
}
