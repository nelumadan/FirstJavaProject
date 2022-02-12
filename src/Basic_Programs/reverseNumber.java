package Basic_Programs;
import java.util.Scanner;

public class reverseNumber 
{
	public static int reverseOfNumber(int num)
	{
		int reverse = 0;
		
		while(num!=0)//First method
		{
			reverse=reverse*10 + num%10;
			num=num/10;
		}
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));//second method using stringBuffer class
//		StringBuffer reverse=sb.reverse();
		
//		StringBuilder sbl=new StringBuilder();//third method using stringBuilder class
//		sbl.append(num);
//		StringBuilder rev=sbl.reverse();

		return reverse;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int num = sc.nextInt();
		
		System.out.println("The reverse of the number is: "+reverseOfNumber(num));
	}
}
