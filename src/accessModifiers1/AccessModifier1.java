package accessModifiers1;

class A
{
	private int a;
	private void display()
	{
		System.out.println(a);
	}
	int b;//by default access modifier is default
	void show()//by default access modifier is default
	{
		System.out.println(b);
	}
}

public class AccessModifier1 
{
	public int i = 10;
	public void m1()
	{
		System.out.println(i);
	}
	
	protected int j;
	protected void m2()
	{
		System.out.println(j);
	}
	
	public static void main(String[] args)
	{
		A obj1 = new A();
		//obj1.a = 10;//cannot access as it is private
		//obj1.display();//cannot access as it is private
		obj1.b = 20;//can be accessed as it is default
		obj1.show();//can be accessed as it is default
	}
}
