package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 
{
	public static void main(String[] args) 
	{
		List<String> list1=Arrays.asList("scott","david","john");
		List<String> list2=Arrays.asList("mary","luna","tom");
		List<String> list3=Arrays.asList("ken","johny","kitty");
		List<List<String>> combinedList=Arrays.asList(list1,list2,list3);//combination of all lists
		
		//using flatMap to create finalList of all names then using map to convert to uppercase
		List<String> finalList=combinedList.stream().flatMap(list->list.stream()).map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(finalList);
	}
}
