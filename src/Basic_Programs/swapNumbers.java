package Basic_Programs;

public class swapNumbers 
{
	public static void swapTwoNumbers(int num1,int num2)
	{
		System.out.println("Before swapping: a="+num1+ " b="+num2);
//		int temp =num1;//First method
//		num1=num2;
//		num2=temp;
		
//		num1=num1+num2;//Second method
//		num2=num1-num2;
//		num1=num1-num2;
		
		num1=num1^num2;//Third method
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("After swapping: a="+num1+ " b="+num2);
	}
	
	public static void main(String[] args) 
	{
		int a =10;
		int b = 20;
		swapTwoNumbers(a,b);
	}
}
