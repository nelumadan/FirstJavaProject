package Basic_Programs;

import java.util.Scanner;

public class countEvenOddDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			int mod=num%10;
			num=num/10;
			if(mod%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Number of even digits is :" +even);
		System.out.println("Number of odd digits is :" +odd);
	}
}
