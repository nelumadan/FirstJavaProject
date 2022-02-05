package Arrays_Programs;

public class checkEqualityOfTwoArrays 
{
	public static void main(String[] args) 
	{
		int a1[]= {4,5,8,7,8,10};
		int a2[]= {4,5,8,7,8,9};
		boolean status=true;
		
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
		}
		else status = false;
		if(status==true)
			System.out.println("The arrays are equal");
		else
			System.out.println("The arrays are not equal");
	}
}
