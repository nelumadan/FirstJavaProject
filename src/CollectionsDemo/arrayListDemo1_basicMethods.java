package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListDemo1_basicMethods 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> al=new ArrayList<Integer>();//declare arraylist for integer type data
//		ArrayList<String> al=new ArrayList<String>();//declare arraylist for string type data
		
		ArrayList al=new ArrayList();//decalre arraylist for heterogenous data
		ArrayList duplicate=new ArrayList();
		
		al.add(100);//add elements at the end of arraylist
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		al.add("java");
		
		duplicate.add('X');
		duplicate.add('Y');
		duplicate.add('Z');
		duplicate.add('W');
		duplicate.add('S');
		duplicate.add('C');
		
		System.out.println("al arraylist: " +al);//print al arraylist
		System.out.println("duplicate arraylist: " +duplicate);//print duplicate arraylist
		
		System.out.println("Number of elements in al: " +al.size());//get size of the arraylist
		
		al.remove("Welcome");//removing by object
		al.remove(2);//removing by index
		System.out.println("al after removal: " +al);//print arraylist
		
		al.add(2,"python");//insertion at index 2
		System.out.println("al after insertion: " +al);//print arraylist
		
		al.set(3, false);//updating at index 3
		System.out.println("al after updation: " +al);//print arraylist
		
		System.out.println("Element at index 2 is: " +al.get(2));//retrieving element at index 2
		
		System.out.println("al contains java: "+al.contains("java"));//will return true or false
		
		System.out.println("al isEmpty: " +al.isEmpty());//will return true or false
		
		System.out.println("Reading al elements using for loop......");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i) +" ");
		}
		
		System.out.println();
		System.out.println("Reading al elements using for for-each loop......");
		for(Object e:al)
		{
			System.out.print(e +" ");
		}
		
		System.out.println();
		System.out.println("Reading al elements using Iterator......");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() +" ");
		}
		
		System.out.println();
		duplicate.addAll(al);//adding all elements from al to duplicate
		System.out.println("Duplicate arraylist after adding al objects: " +duplicate);
		
		duplicate.removeAll(al);//removing all elements of al from duplicate
		System.out.println("Duplicate arraylist after removal of al objects: " +duplicate);
		
		Collections.sort(duplicate);//sorting in ascending
		System.out.println("Duplicate arraylist after sorting: " +duplicate);
		
		Collections.sort(duplicate,Collections.reverseOrder());//sorting in descending or reverse order
		System.out.println("Duplicate arraylist after reverse sorting: " +duplicate);
		
		Collections.shuffle(duplicate);//shuffling the arraylist
		System.out.println("Duplicate arraylist after shuffling: " +duplicate);
	}
}
