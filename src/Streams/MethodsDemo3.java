package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodsDemo3 
{
	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("A","B","C","1","2","3");
		
		//reduce() terminal method
		Optional<String> reducedList=list.stream().reduce((value,combinedvalue)->{
														return combinedvalue+value;
													});
		System.out.println(reducedList.get());
	}
}
