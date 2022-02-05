package CollectionsDemo;

import java.util.ArrayList;

public class arrayListDemo3_convertingArrayListToArray 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Elements from arraylist");
		System.out.println(al);
		
		System.out.println("--------------------");
		System.out.println("Elements from array");
		Object[] arr = al.toArray();//converting arraylist to array
		for(Object elements : arr)
			System.out.print(elements + " ");
	}
}
