package oops;

public class MethodTypes
{
	int a;
	int b;
	
	void sum()//method not taking any parameters
	{
		System.out.println("Sum = " +(a+b));
	}
	
	void diff(int x, int y)//method taking parameters
	{
		a = x;
		b = y;
		System.out.println("Difference = " +(a-b));
	}
	
	int product()//method returning some value
	{
		return(a*b);
	}
	
	void div()//method not returning any value
	{
		System.out.println("Division = " +(a/b));
	}
	
	public static void main(String[] args)
	{
		MethodTypes method = new MethodTypes();
		method.a = 100;
		method.b = 200;
		
		method.sum();
		
		method.diff(100, 200);
		
		int result = method.product();
		System.out.println("Product = " +result);
		
		method.div();
	}
}
