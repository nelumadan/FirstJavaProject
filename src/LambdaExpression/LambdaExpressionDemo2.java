package LambdaExpression;

@FunctionalInterface
interface Cab2
{
	public void bookCab(String source,String destination);
}

public class LambdaExpressionDemo2 
{
	public static void main(String[] args) 
	{
		Cab2 cab=(source,destination)->System.out.println("Ola cab is booked from "+source+" to "+destination);
		cab.bookCab("Hyderabad","Mumbai");
	}
}
