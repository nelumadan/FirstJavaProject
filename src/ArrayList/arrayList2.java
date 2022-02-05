package ArrayList;

import java.util.ArrayList;

public class arrayList2
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		
		System.out.println("The number of elements in the arraylist is: " +a1.size());
		
		//Adding elements to arraylist
		a1.add("welcome");
		a1.add("A");
		a1.add(10);
		a1.add(10.45);
		
		System.out.println("The number of elements in the arraylist after adding is: " +a1.size());
		System.out.println("The elements are: " +a1);
		
		//inserting element in the array list
		a1.add(2,"training");//training will be inserted after 2nd position
		System.out.println("The number of elements in the arraylist after insert is: " +a1.size());
		System.out.println("The elements are: " +a1);
		
		a1.add(4,1234);//1234 will be inserted after 4th position
		System.out.println("The number of elements in the arraylist after insert is: " +a1.size());
		System.out.println("The elements are: " +a1);
	
		a1.remove(3);//element after 3rd position will be removed
		System.out.println("The number of elements in the arraylist after remove is: " +a1.size());
		System.out.println("The elements are: " +a1);
		
		a1.remove("training");//training will be removed
		System.out.println("The number of elements in the arraylist after remove is: " +a1.size());
		System.out.println("The elements are: " +a1);
	}
}
