package ExceptionHandling;

public class exceptionHandling
{
	public static void main(String[] args)
	{
		System.out.println("started");
		
		//Thread.sleep(4000);//InterruptedException(checked exception identified by the compiling time)
		
		int i = 10;
		System.out.println(i/0);//ArithmeticException(unchecked exception identified during runtime because of divide by zero)
		
		System.out.println("stopped");
	}
}
