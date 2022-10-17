package LambdaExpression;

@FunctionalInterface
interface Cab3
{
	public String bookCab(String source,String destination);
}

public class LambdaExpressionDemo3 
{
	public static void main(String[] args) 
	{
		Cab3 cab=(source,destination)-> { System.out.println("Ola cab is booked from "+source+" to "+destination);
										return ("Price: Rs.5000");
										};
		System.out.println(cab.bookCab("Hyderabad","Mumbai"));
	}
}
