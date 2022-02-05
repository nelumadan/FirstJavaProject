package oops;

interface parent1
{
	int a = 10;
	void display();
}

interface parent2
{
	int b = 20;
	void show();
}

public class MultipleInheritance implements parent1,parent2
{
	public void display()
	{
		System.out.println("Value of a= " +a);
	}
	
	public void show()
	{
		System.out.println("Value of b= " +b);
	}
	
	public static void main(String[] args)
	{
		MultipleInheritance mi = new MultipleInheritance();
		mi.display();
		mi.show();
	}
}
//achieving multiple inheritance through interface