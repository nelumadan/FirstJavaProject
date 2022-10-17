package oops;

class Employee
{
	int empid;
	int salary;
	//static variable is not object specific its class specific(same for all the objects of this class)
	//will take place in classloader memory
	static String ceo;
	
	//static block used to initialise the static variable once, will execute once before the main when you load the class 
	static
	{
		ceo="Neelam";
	}
	
	public void show()
	{
		System.out.println(empid +"    "+ salary +" "+ ceo );
	}
}

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.empid=101;
		emp1.salary=10000;
		
		Employee emp2 = new Employee();
		emp2.empid=102;
		emp2.salary=20000;
		
		System.out.println("Emp_Id" +" "+ "Salary" +" "+ "Ceo" );
		emp1.show();
		emp2.show();
	}
}
