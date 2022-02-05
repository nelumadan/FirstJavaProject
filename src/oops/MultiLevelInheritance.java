package oops;

class A1
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

class B1 extends A1
{
	int p;
	int q;
	public void show()
	{
		System.out.println(p+q);
	}
}

class C1 extends B1
{
	int x;
	int y;
	public void sum()
	{
		System.out.println(x+y);
	}
}
public class MultiLevelInheritance
{
	public static void main(String[] args)
	{
		//can access all var's and methods of class A1 and B1 from class C1 object because B1 extends A1 and C1 extends B1 so ultimately C1 extends A1 & B1
		C1 cobj = new C1();
		cobj.a = 100;
		cobj.b = 200;
		cobj.display();
		cobj.p = 300;
		cobj.q = 400;
		cobj.show();
	}
}
