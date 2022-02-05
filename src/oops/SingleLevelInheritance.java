package oops;

class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}

public class SingleLevelInheritance
{

	public static void main(String[] args)
	{
		B bobj = new B();
		
		bobj.a = 150;//you can access all variables and methods of class A from class B object because B extends A
		bobj.b = 250;
		bobj.display();
	}

}
