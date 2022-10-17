package Streams;

import java.util.Arrays;
import java.util.List;
//find the length of every element and print them
public class MapDemo2 
{
	public static void main(String[] args) 
	{
		List<String> vehicles=Arrays.asList("bus", "car", "bicycle", "flight","train");
		
		//without streams
		for(String name:vehicles)
		{
			System.out.println(name +"-" +name.length());
		}
		
		//with streams
		List<String> words=Arrays.asList("cup", "saucer", "tea","sugar","spoon");
		//words.stream().map(word->word.length()).forEach(len->System.out.println(len));//will just print length
		words.stream().map(word->word).forEach(word->System.out.println(word +"-" +word.length()));//will print words and length
	}
}
