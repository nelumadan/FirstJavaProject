package Basic_Programs;

import java.util.Random;

public class generateRandomNumber 
{
	public static void main(String[] args) 
	{
		Random ran = new Random();
		
		int random_int = ran.nextInt(1000);//you can put 10,100 or 1000
		System.out.println(random_int);
		
		double random_double = ran.nextDouble();//range 0.0 and less than 1.0
		System.out.println(random_double);
		
	}
}
