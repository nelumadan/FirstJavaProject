package Arrays_Programs;

public class linearSearchAnElement 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,30,40,56,20,35};
		int num=56;
		int i;
		boolean flag=false;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println("The element " +num+ " is there in the array at index " +i);
		else
			System.out.println("The element " +num+ " is not there in the array");
		
	}
}
