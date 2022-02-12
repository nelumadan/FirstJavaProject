package Basic_Programs;
import java.util.Scanner;

public class largestOfTwoNumbers 
{
	public static int findLargestOfTwoNumbers(int num1,int num2)
	{
		int largest=0;
		if(num1 > num2)
			largest=num1;
		else
			largest=num2;
		
		return largest;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("The largest of two numbers is: " +findLargestOfTwoNumbers(num1,num2));
	}
}
