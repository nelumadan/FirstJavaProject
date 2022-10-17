package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//convert elements to uppercase and store them in another collection
public class MapDemo1 
{
	public static void main(String[] args) 
	{
		List<String> vehicles=Arrays.asList("bus", "car", "bicycle", "flight","train");
		List<String> vehiclesUppercase=new ArrayList<String>();
		
		//without streams
		for(String name:vehicles)
		{
			vehiclesUppercase.add(name.toUpperCase());
		}
		System.out.println(vehiclesUppercase);
		
		//with streams
		List<String> words=Arrays.asList("cup", "saucer", "tea","sugar","spoon");
		List<String> wordsUppercase=new ArrayList<String>();
		wordsUppercase=words.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(wordsUppercase);
	}
}
