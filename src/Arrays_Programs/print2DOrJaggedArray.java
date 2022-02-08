package Arrays_Programs;

public class print2DOrJaggedArray 
{
	public static void main(String[] args)
	{
		int[][] arr1= {
						{3,4,7,9,3,5},
						{5,7,3,4,6,2},
						{6,7,9,2,3,5},
						{8,1,3,6,7,8}
					  };
		
		int[][] arr2= {
						{3,4,7,9,3,5},
						{5,7,3,4},
						{6,7,9,2,3},
						{8,1,3}
					  };
		
		for(int i=0;i<arr1.length;i++)//first way using for loop
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		for(int arr[] : arr2)//2nd way using advanced for loop
		{
			for(int value:arr)
			{
				System.out.print(value +" ");
			}
			System.out.println();
		}
		
	}
}
