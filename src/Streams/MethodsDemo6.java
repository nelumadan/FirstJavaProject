package Streams;

import java.util.HashSet;
import java.util.Set;

public class MethodsDemo6 
{
	public static void main(String[] args) 
	{
		Set<String> fruits=new HashSet<String>();
		
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More grapes");
		fruits.add("Two guavas");
		
		//anyMatch()
		boolean anymatchStatus=fruits.stream().anyMatch(value-> {return value.startsWith("One");});
		System.out.println("Anymatch: " +anymatchStatus);
		
		//allMatch()
		boolean allmatchStatus=fruits.stream().allMatch(value-> {return value.startsWith("One");});
		System.out.println("Allmatch: " +allmatchStatus);
		
		//noneMatch()
		boolean nonematchStatus=fruits.stream().noneMatch(value-> {return value.startsWith("One");});
		System.out.println("Nonematch: " +nonematchStatus);
	}
}
