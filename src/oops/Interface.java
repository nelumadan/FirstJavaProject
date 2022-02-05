package oops;

interface Test_Interface
{
	int a = 10;//in interface by default variables are static and final
	void display();//in interface by deafault methods are abstract(no implementation(body))
}

public class Interface implements Test_Interface
{
	public void display()//when a class implements an interface you have to implement its method inside the class
	{
		System.out.println("Value of a= " +a);
	}
	
	public static void main(String[] args)
	{
		Interface i = new Interface();
		i.display();
	}
}
//cannot create object of interface(cannot be instantiated),
//have to create object of class implementing the interface to access methods and variables inside