package LambdaExpression;

@FunctionalInterface
interface Cab1
{
	public void bookCab();
}

public class LambdaExpressionDemo1 
{
	public static void main(String[] args) 
	{
		Cab1 cab=()->System.out.println("Ola cab is booked....");
		cab.bookCab();
	}
}
//dont have to create any class implementing interface to use the interface
//you can directly create object of interface class and use the method inside it with lambda expression