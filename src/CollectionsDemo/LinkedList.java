package CollectionsDemo;

class Node
{
	int data;
	Node next;
}

public class LinkedList 
{
	Node head;

	void insert(int num)
	{
		Node temp = new Node();
		temp.data = num;
	
		if (head == null) // empty list
		{
			head = temp;
			temp.next = null;
		}
		else
		{
			Node currentNode = head;
			if (currentNode.next == null)// one node in the list
			currentNode.next=temp;
			else
			{
				// more than 1 node in the list
				while (currentNode.next != null)
				{
					currentNode = currentNode.next;
				}
				currentNode.next=temp;
			}
		
		}
	}

	public void show()
	{
		Node currentNode = head;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	public static void main(String[] args) 
	{
		LinkedList mylist = new LinkedList();
		mylist.insert(1);
		mylist.insert(2);
		mylist.insert(3);
		mylist.insert(4);
		mylist.show();		
	}
}
