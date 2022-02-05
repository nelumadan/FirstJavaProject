package CollectionsDemo;

import java.util.LinkedList;

public class linkedListDemo1 
{
	
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();//declare linkedlist for storing heterogenous data
		
		l.add(100);
		l.add("welcome");
		l.add(25.5);
		l.add('N');
		l.add(true);
		l.add(null);
		
		System.out.println("Linked list: " +l);
		//basic methods are same as arrayList
		
		l.addFirst("Neelam");
		System.out.println("Linked list after adding element in first position : " +l);
		
		l.addLast("Madan");
		System.out.println("Linked list after adding element in last position : " +l);
		
		System.out.println("The first element is :" +l.getFirst());
		System.out.println("The last element is :" +l.getLast());
		
		l.removeFirst();
		System.out.println("Linked list after removing element in first position : " +l);
		
		l.removeLast();
		System.out.println("Linked list after removing element in last position : " +l);
	}
}
