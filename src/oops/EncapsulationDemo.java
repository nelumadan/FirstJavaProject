package oops;

class Student
{
	private int rollno;//variables should be private
	private String name;
	
	//Getters and Setters(methods used to set and get the values for the variables.
	//To automatically generate these just right click here goto
	//source>generate getters and setters and select both the variables
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

public class EncapsulationDemo //Binding data with the methods is called Encapsulation
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setRollno(4);
		s1.setName("Neelam");
		System.out.println("Student Rollno: " +s1.getRollno());
		System.out.println("Student Name: " +s1.getName());
	}
}
