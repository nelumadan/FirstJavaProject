package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsDemo1 
{
	public static void main(String[] args) 
	{
		List<String> vehicles=Arrays.asList("bus", "car", "bicycle", "flight","car", "train", "car","bus");
		
		//non-terminal method distinct() and terminal method count()
		long distinctVehicles=vehicles.stream().distinct().count();
		System.out.println(distinctVehicles);
		
		//terminal method limit()
		List<String> firstThreeVehicles=vehicles.stream().limit(3).collect(Collectors.toList());
		System.out.println(firstThreeVehicles);
	}
}
