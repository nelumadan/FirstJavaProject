package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodsDemo2 {

	public static void main(String[] args) 
	{	
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//number of even numbers using terminal method count()
		long even=numbers.stream().filter(num->num%2==0).count();
		System.out.println("number of even numbers: " +even);
		
		//min() non-terminal method
		Optional<Integer> min=numbers.stream().min((num1,num2)->{return num1.compareTo(num2);});
		System.out.println("minimum number: " +min.get());
		
		//max() non-terminal method
		Optional<Integer> max=numbers.stream().max((num1,num2)->{return num1.compareTo(num2);});
		System.out.println("maximum number: " +max.get());
	}
}
