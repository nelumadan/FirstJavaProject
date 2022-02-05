package ExceptionHandling;

public class uncheckedException
{
	public static void main(String[] args)
	{
		System.out.println("Program started");
		int a=20;
		try
		{
			System.out.println(a/0);//Arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: " +e.getMessage());
		}
		
		String s=null;
		try
		{
			System.out.println(s.length());//NullPointerException
		}
		catch(NullPointerException e)
		{
			System.out.println(e);//1st way of printing exception info
		}
		
		String st="abcdef";
		try
		{
			int i=Integer.parseInt(st);//NumberFormatException
			System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception: " +e.getMessage());//2nd way of printing exception info
		}
		
		int arr[]=new int[5];
		try
		{
			arr[10]=100;//ArrayIndexOutOfBoundException
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();//3rd way of printing exception info
		}
		finally
		{
			System.out.println("This is finally block.");
		}
		System.out.println("Program stopped");
	}
}
//finally block can be given with try-catch which will execute in any case whether exception occurs or not or whether it gets handled or not