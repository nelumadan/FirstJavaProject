package oops;

class Calc1
{	
	static int a;
	static int b;
	public void sum(int a,int b)
	{
		System.out.println("Sum= " +(a+b));
	}
}

class Calc2 extends Calc1
{
	public void diff(int a,int b)
	{
		System.out.println("Difference= " +(a-b));
	}
}

class Calc3 extends Calc2
{
	public void prod(int a,int b)
	{
		System.out.println("Product= " +(a*b));
	}
}
public class MultiLevelInheritance
{
	public static void main(String[] args)
	{
		//can access all var's and methods of class Calc1 and Calc2 from class Calc3 object
		//because Calc2 extends Calc1 and Calc3 extends Calc2 so ultimately Calc3 extends Calc1 & Calc2
		int a=25;
		int b=20;
		Calc3 obj = new Calc3();
		obj.sum(a,b);
		obj.diff(a,b);
		obj.prod(a,b);
	}
}
