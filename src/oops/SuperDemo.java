package oops;

class Parent
{
	public Parent()
	{
		System.out.println("Parent constructor");
	}
}

class Child extends Parent
{
	public Child()
	{
		super();
		//whether you use this here or not compiler will automatically call super() method that is constructor
		//of super class before calling constructor of child class when you create an object of child class
		System.out.println("Child constructor");
	}
}

public class SuperDemo 
{
	public static void main(String[] args) 
	{
		Child object = new Child();
	}
}
