package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//print salary of employees with salary>20000, then print salary*5 for each employee
class Employee
{
	int empid;
	String empname;
	int salary;
	
	Employee(int empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
}
public class FilterMapDemo 
{
	public static void main(String[] args) 
	{
		List<Employee> employees=Arrays.asList(new Employee(101,"Neelam",30000),
												new Employee(102,"Anil",40000),
												new Employee(103,"Anshul",20000),
												new Employee(104,"Khushi",15000));
		List<Integer> sal=new ArrayList<Integer>();
		//combination of filter and map
		sal = employees.stream().filter(emp->emp.salary>20000).map(emp->emp.salary*5).collect(Collectors.toList());
		System.out.println(sal);
	}
}
