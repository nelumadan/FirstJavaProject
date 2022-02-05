package Basic_Programs;
import java.util.Scanner;

public class reverseNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int num = sc.nextInt();
		
//		int rev = 0;//First method
//		while(num!=0)
//		{
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		System.out.println("Reversed number is :" +rev);
		
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));//second method using stringBuffer class
//		StringBuffer rev=sb.reverse();
//		System.out.println("Reversed number is :" +rev);
		
		
		StringBuilder sbl=new StringBuilder();//third method using stringBuilder class
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reversed number is :" +rev);
	}
}
