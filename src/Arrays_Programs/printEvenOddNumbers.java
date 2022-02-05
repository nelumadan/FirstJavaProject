package Arrays_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printEvenOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n+ " numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)//you can also say for(int value:arr)
		{
			if(arr[i]%2 == 0)//if(value%2==0)
				even.add(arr[i]);//even.add(value)
			else
				odd.add(arr[i]);//odd.add(value)
		}
		System.out.println("Even numbers are:");
        for (int i = 0; i < even.size(); i++) 
        {
            System.out.print(even.get(i) + " ");
        }
        System.out.println();
        System.out.println("Odd numbers are:");
        for (int j = 0; j < odd.size(); j++) 
        {
            System.out.print(odd.get(j) + " ");
        }
	}
}