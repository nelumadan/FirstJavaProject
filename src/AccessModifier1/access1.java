package AccessModifier1;

public class access1 
{	
	private int p;
	private void exhibit()
	{
		System.out.println(p);
	}
	
	public static void main(String[] args) 
	{
		accessModifiers obj = new accessModifiers();
		//obj.a = 10;//cannot access because private
		//obj.show();//cannot access because private
		
		obj.b=20;//can be accessed as it is default
		obj.display();//can be accessed as it is default
		
		obj.c = 40;//can be accessed as it is public
		obj.print();//can be accessed as it is public
		
		obj.d = 80;//can be accessed protected variable because its in same package
		obj.reveal();//can be accessed protected method because its in same package
		
		access1 ac = new access1();
		ac.p=200;//can access private variable because it is in same class
		ac.exhibit();//can access private method because it is in same class
	}
}
