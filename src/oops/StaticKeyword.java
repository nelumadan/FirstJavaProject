package oops;

public class StaticKeyword
{
	static int a;//static variable
	int b;//non static variable
	
	static void m1()//static method
	{
		System.out.println("M1 is a static method.");
	}
	
	void m2()//non-static method
	{
		System.out.println("M2 is a non-static method.");
	}
	
	void m3()//non-static method can access everything directly
	{
		a=300;
		System.out.println("static variable a= " +a);
		m1();
		System.out.println("");
		b=400;
		System.out.println("non-static variable b= " +b);
		m2();
	}
	
	public static void main(String[] args)//main method is static
	{
		//static stuff can be accessed directly by static method
		a=100;
		System.out.println("static variable a= " +a);
		m1();
		
		System.out.println();
		
		//non-static stuff cannot be accessed directly by static method. Have to create an object
		StaticKeyword sk = new StaticKeyword();
		sk.b=200;
		System.out.println("non-static variable b= " +sk.b);
		sk.m2();
		System.out.println("--------------------------");
		
		sk.m3();
	}
}
