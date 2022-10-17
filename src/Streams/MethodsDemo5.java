package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsDemo5 
{
	public static void main(String[] args) 
	{
		//sorted() method for integers
		List<Integer> integerList=Arrays.asList(2,4,1,5,3,7,6,9);
		
		//ascending order
		List<Integer> sortedList1=integerList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList1);
		
		//descending order
		List<Integer> sortedList2=integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList2);
		
		//sorted() method for strings
		List<String> stringList=Arrays.asList("John","Mary","Kim","David","Smith");
		
		//ascending order
		List<String> sortedList3=stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList3);
		
		//descending order
		List<String> sortedList4=stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList4);
	}
}
