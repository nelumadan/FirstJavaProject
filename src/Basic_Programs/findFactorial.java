package Basic_Programs;

import java.math.BigInteger;

public class findFactorial 
{
	public static BigInteger factorial(int num)
	{
		BigInteger factorial = BigInteger.ONE;
		
		while(num>1)
		{
			factorial = factorial.multiply(BigInteger.valueOf(num));
			num--;
		}
		return factorial;
	}
	
	public static void main(String[] args)
	{
		int n=30;
		BigInteger fact=factorial(n);
		System.out.println("The factorial of is: ");
		System.out.printf("%d", fact);
	}
}
