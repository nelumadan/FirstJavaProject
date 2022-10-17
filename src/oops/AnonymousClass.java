package oops;

class X
{
	public void show()
	{
		System.out.println("In class X");
	}
}

public class AnonymousClass 
{
	public static void main(String[] args) 
	{
		X obj = new X()
						{
							public void show()//anonymous class, if you want to override the method of class X just for one time
							{
								System.out.println("In Anonymous class");
							}
						};
						obj.show();
	}
}
