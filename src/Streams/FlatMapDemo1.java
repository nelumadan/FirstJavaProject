package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 
{
	public static void main(String[] args) 
	{
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		List<Integer> list4=Arrays.asList(7,8);
		List<List<Integer>> combinedList=Arrays.asList(list1,list2,list3,list4);//combination of all lists
		
		//using flatMap to create finalList of all numbers and then using Map to multiply all numbers by 10
		List<Integer> finalList=combinedList.stream().flatMap(list->list.stream()).map(num->num*10).collect(Collectors.toList());
		System.out.println(finalList);
	}
}
