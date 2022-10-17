package oops;

class A
{
	int a=10;
	
	void m1()
	{
		System.out.println("Parent class method");
	}
}

class B extends A
{
	int a=20;
	
	void m1()
	{
		System.out.println("Child class method");
	}
	
	void show(int a)
	{
		System.out.println("a= " +a);//local variable
		System.out.println("a= " +this.a);//instance variable of current class
		System.out.println("a= " +super.a);//instance variable of parent class
		
		m1();//will call current class m1 method
		super.m1();//will call parent class m1 method
	}
}
public class ThisAndSuperKeyword 
{
	public static void main(String[] args) 
	{
		B object = new B();//creating an object of child class
		object.show(30);
	}
}
