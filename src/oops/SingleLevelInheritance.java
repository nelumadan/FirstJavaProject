package oops;

class Calculator_Parent
{
	int a;
	int b;
	public void add(int a,int b)
	{
		System.out.println("Addition= " +(a+b));
	}
}

class Calculator_Child extends Calculator_Parent
{
	int x;
	int y;
	public void sub(int x,int y)
	{
		System.out.println("Subtraction= " +(x-y));
	}
}

public class SingleLevelInheritance
{
	public static void main(String[] args)
	{
		Calculator_Child c1 = new Calculator_Child();
		
		c1.add(25,20);//you can access all variables and methods of parent/super class from child/sub class object because child extends parent
		c1.sub(25,20);
	}

}
