package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodsDemo7 
{
	public static void main(String[] args) 
	{
		List<String> stringList=Arrays.asList("one","two","three","one");
		
		//findAny()-will return NoSuchElementException if list is empty
		Optional<String> findanyList=stringList.stream().findAny();
		System.out.println(findanyList.get());
		
		//findFirst()-will return NoSuchElementException if list is empty
		Optional<String> findfirstList=stringList.stream().findAny();
		System.out.println(findfirstList.get());
	}
}
