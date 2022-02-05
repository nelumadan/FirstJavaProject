package oops;

public class VariableInitialisation
{
	int empid;
	String empname;
	int salary;
	int deptno;
	
//	VariableInitialisation(int id,String name,int sal,int dno)//constructor
//	{
//		empid = id;
//		empname = name;
//		salary = sal;
//		deptno = dno;
//	}
	
	void setData(int id,String name,int sal,int dno)//user defined method
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	
	void display()//user defined method
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String[] args)//main method
	{
		//Assigning values to class variables using object
//		VariableInitialisation emp1 = new VariableInitialisation();
//		emp1.empid = 100;
//		emp1.empname = "Neelam";
//		emp1.salary = 10000;
//		emp1.deptno = 001;
//		emp1.display();
		
		//Assigning values to class variables using constructor variableInitialisation()
//		VariableInitialisation emp2 = new VariableInitialisation(200,"Anil",20000,002);
//		emp2.display();
		
		//Assigning values to class variables using method setData()
		VariableInitialisation emp3 = new VariableInitialisation();
		emp3.setData(300, "Anshul", 5000, 003);
		emp3.display();
	}
}
