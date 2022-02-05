package oops;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running.");
	}
}

class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running.");
	}
}

class Scooter extends Vehicle
{
	void run()
	{
		System.out.println("Scooter is running.");
	}
}

public class HierarchicalInheritance
{
	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		v.run();
		
		Bike b = new Bike();
		b.run();
		
		Scooter s = new Scooter();
		s.run();
	}
}
//Classes Bike and Scooter inherits the same class Vehicle(single parent,multiple child)
//run method of parent class is over ridden in child classes.