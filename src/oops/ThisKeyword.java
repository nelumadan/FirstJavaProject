package oops;

public class ThisKeyword 
{
	int a;
	int b;
	
	public ThisKeyword(int a,int b)
	{
		this.a=a;//this keyword is used to refer to instance variable when the name of instance variable and local variable is same
		this.b=b;
	}
	
	void sum()
	{
		System.out.println("Sum= " +(a+b));
	}
	
	public static void main(String[] args) 
	{
		ThisKeyword obj = new ThisKeyword(20,40);
		obj.sum();
	}
}
