package oops;

class Outer
{
	int a;
	void show()
	{
		System.out.println("In outer class");
	}
	
	class Inner//member class inside a class
	{
		public void display()
		{
			System.out.println("In inner class");
		}
		
	}
	
	static class sInner//static inner class
	{
		public void reveal()
		{
			System.out.println("In static inner class ");
		}
	}
}

public class InnerDemo 
{
	public static void main(String[] args) 
	{
		Outer obj_outer = new Outer();
		obj_outer.show();
		
		Outer.Inner obj_inner = obj_outer.new Inner();//creating an object of inner class
		obj_inner.display();
		
		Outer.sInner obj_sInner = new Outer.sInner();//creating an object of static inner class
		obj_sInner.reveal();
	}
}
