package Streams;

import java.util.Arrays;
import java.util.List;

public class MethodsDemo4 {

	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("A","B","C","1","2","3");
		
		//toArray() terminal method
		Object arr[]=list.stream().toArray();
		
		for(Object obj:arr)
		{
			System.out.print(obj +" ");
		}
	}

}
