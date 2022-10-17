package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsDemo8 
{
	public static void main(String[] args) 
	{
		List<String> animalList=Arrays.asList("Dog","Cat","Tiger","Horse");
		List<String> birdList=Arrays.asList("Pigeon","Parrot","Crow","Sparrow");
		
		Stream<String> stream1=animalList.stream();
		Stream<String> stream2=birdList.stream();
		
		//concat() method
		List<String> finalList=Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(finalList);
	}
}
