package Arrays_Programs;

import java.util.ArrayList;
import java.util.List;

public class convertArrayListToArray 
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
		Object[] arr = al.toArray();//have to create array of objects because arraylist is a list of objects
		for(Object elements : arr)
			System.out.print(elements + " ");
	}
}
