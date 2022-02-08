package oops;

interface Abc
{
	public void show();
}

public class FunctionalInterfaceWithAnonymousClass 
{
	public static void main(String[] args) 
	{
		Abc obj = new Abc()
				{
					public void show()//anonymous class, if you want to override the method of class Abc just for one time
					{
						System.out.println("In Anonymous class");
					}
				};
		obj.show();
	}
}
