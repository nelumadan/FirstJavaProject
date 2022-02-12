package Basic_Programs;
import java.util.Scanner;

public class largestOfThreeNumbers 
{
	public static int findLargestOfThreeNumbers(int num1,int num2,int num3)
	{
		int largest=0;
//		if(num1>num2 && num1>num3)//first method
//			largest=num1;
//		else if(num2>num1 && num2>num3)
//			largest=num2;
//		else
//			largest=num3;
		
		largest=num1>num2?num1:num2;//second method using ternary operator
		largest=num3>largest?num3:largest;
		
		return largest;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		
		System.out.println("The largest of three numbers is: " +findLargestOfThreeNumbers(num1,num2,num3));
	}
}
