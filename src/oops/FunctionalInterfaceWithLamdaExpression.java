package oops;

interface Xyz
{
	void show();
}

public class FunctionalInterfaceWithLamdaExpression 
{
	public static void main(String[] args) 
	{
		Xyz obj =()-> System.out.println("In Anonymous class");//lambda expression only works with functional interface and only java 8
		obj.show();
	}
}
