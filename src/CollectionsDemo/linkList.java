package CollectionsDemo;

public class linkList 
{

	class linkNode
	{
		int num;
		linkNode next = null;
		
		void add(int val, linkNode head)
		{
		  
		  
			  linkNode temp = new linkNode();
			  temp.num = val;
			  temp.next = head;
			  head=temp;
		  
		}
		void print(linkList head)
		{
			linkList temp = head;
		   while (temp != null)
		   {
			   System.out.println("number "+temp.num );
			   temp = temp.next;
		   }
		}
	}
	public static void main(String[] args) 
	{
		linkList head = new linkList();
		 linkNode list = new linkNode();
		 list.add(1, head);
		 list.add(2, head);
         list.print(head);		
		
	}
}
