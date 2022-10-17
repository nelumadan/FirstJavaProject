package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) 
	{
//		ArrayList<Integer> numbersList = new ArrayList<Integer>();
//		numbersList.add(10);
//		numbersList.add(15);
//		numbersList.add(20);
//		numbersList.add(25);
//		numbersList.add(30);
		
		//another way to create arrayList in one go using asList method of Arrays class
		List<Integer> numbersList=Arrays.asList(10,15,20,25,30);
		List<Integer> evenList=new ArrayList<Integer>();
		
		//creating even numbers list without using streams
		for(int n:numbersList)
		{
			if(n%2==0)
				evenList.add(n);
		}
		System.out.println(evenList);
		
		//filtering even numbers list using streams
		evenList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		//for directly printing without storing in another collection
		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));//one way to print
		numbersList.stream().filter(n->n%2==0).forEach(System.out::println);//second way to print
	}

}
