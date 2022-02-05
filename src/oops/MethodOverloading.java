package oops;

public class MethodOverloading
{
	int a;
	int b;
	
	void sum()//1st method
	{
		a = 100;
		b = 200;
		System.out.println("sum1 = " +(a+b));
	}
	
	void sum(int x, int y)//2nd method
	{
		a = x;
		b = y;
		System.out.println("sum2 = " +(a+b));
	}
	
	void sum(int x,int y,int z)//3rd method
	{
		System.out.println("sum3 = " +(x+y+z));
	}
	
	void sum(int x, double y)//4th method
	{
		System.out.println("sum4 = " +(x+y));
	}
	
	public static void main(String[] args)
	{
		MethodOverloading method = new MethodOverloading();
		
		method.sum();//will call 1st method
		method.sum(200,300);//will call 2nd method
		method.sum(100,200,300);//will call 3rd method
		method.sum(100,100.55);//will call 4th method
	}
}
