package oops;

class Calc
{
	public int add(int ... n)//Varargs = it can take any number of arguments which will be stored in an array n
	{
		int sum=0;
		for (int i:n)
		{
			sum = sum+i;
		}
		return sum;
	}
}

public class VarargsDemo 
{
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		int result=obj.add(4,5,6,7,8,10);//you can send any number of arguments
		System.out.println(result);
	}
}
