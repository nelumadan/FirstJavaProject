package oops;

//abstract class is a class whose object cannot be created
//cannot create object of abstract class(cannot be instantiated),
//have to create object of class extending the abstract class to access methods and variables inside

abstract class Writer
{
	public abstract void write();
}

class Pen extends Writer
{
	public void write()
	{
		System.out.println("I am a Pen");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("I am a Pencil");
	}
}

public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Pen p = new Pen();
		p.write();
		
		Pencil pc = new Pencil();
		pc.write();
	}
}
