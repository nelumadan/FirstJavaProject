package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//removing nulls and printing data again
public class FilterDemo3 {

	public static void main(String[] args) 
	{
		List<String> words=Arrays.asList("cup", null, "saucer", "tea", null,"sugar","spoon",null);
		List<String> newWords=words.stream().filter(w-> w!=null).collect(Collectors.toList());
		System.out.println(newWords);
	}

}
