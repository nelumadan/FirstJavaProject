package ExceptionHandling;

public class checkedException
{
	public static void main(String[] args) throws InterruptedException//throws declaration to handle checked exceptions
	{
		System.out.println("Program started");
		
		Thread.sleep(4000);

		System.out.println("Program stopped");
	}
}
