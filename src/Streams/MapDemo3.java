package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//multiply each number by 3 and store in target list and print
public class MapDemo3 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers=Arrays.asList(2,3,4,5,6,7);
		List<Integer> products=new ArrayList<Integer>();
		
		//without stream
		for(int num:numbers)
		{
			products.add(num*3);	
		}
		System.out.println(products);

		//with stream
		products=numbers.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(products);
	}
}
