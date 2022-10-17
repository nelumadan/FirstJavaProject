package ExceptionHandling;

public class exceptionHandling
{
	public static void main(String[] args)
	{
		System.out.println("started");
		
		//Thread.sleep(4000);//InterruptedException(checked exception identified by the compiling time)
		
		int i = 10;
		System.out.println(i/0);//ArithmeticException(unchecked exception identified during runtime because of divide by zero)
		//program will terminate because exception is not handled and next line will not get executed
		
		System.out.println("stopped");
	}
}
