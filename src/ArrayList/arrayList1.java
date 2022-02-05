package ArrayList;

import java.util.ArrayList;

public class arrayList1
{
	public static void main(String[] args)
	{
		ArrayList <String> list=new ArrayList<String>();
		
		//Adding elements to arraylist
		list.add("Neelam");
		list.add("Anil");
		list.add("Anshul");
		list.add("Khushi");
		
		System.out.println("The number of elements in the arraylist is: " +list.size());
		System.out.println("The elements are: ");
		
		for(String s:list)//reading elements from the list
		{
			System.out.println(s);
		}
	}
}
