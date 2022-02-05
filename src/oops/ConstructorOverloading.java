package oops;

public class ConstructorOverloading
{
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading()//1st
	{
		a=10;
		b=20;
		c=30;
	}
	
	ConstructorOverloading(int x,int y)//2nd
	{
		a=x;
		b=y;
	}
	
	ConstructorOverloading(int x,double y)//3rd
	{
		a=x;
		c=y;
	}
	
	ConstructorOverloading(int x,int y, double z)//4th
	{
		a=x;
		b=y;
		c=z;
	}
	
	void display()
	{
		System.out.print("a=" +a);
		System.out.print(" b=" +b);
		System.out.print(" c=" +c);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		ConstructorOverloading constructor1 = new ConstructorOverloading();//1st constructor called
		constructor1.display();
		
		ConstructorOverloading constructor2 = new ConstructorOverloading(20,30);//2nd constructor called
		constructor2.display();
		
		ConstructorOverloading constructor3 = new ConstructorOverloading(40,20.5);//3rd constructor called
		constructor3.display();
		
		ConstructorOverloading constructor4 = new ConstructorOverloading(50,70,30.5);//4th constructor called
		constructor4.display();
	}
}
