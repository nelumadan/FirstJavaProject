package oops;

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}
}

class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 15;
	}
}

class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 12;
	}
}

public class MethodOverriding
{
	public static void main(String[] args) 
	{
		SBI sb_obj = new SBI();
		System.out.println("ROI for SBI is :" +sb_obj.getRateOfInterest());
		
		ICICI ic_obj = new ICICI();
		System.out.println("ROI for ICICI is :" +ic_obj.getRateOfInterest());
		
		AXIS ax_obj = new AXIS();
		System.out.println("ROI for AXIS is :" +ax_obj.getRateOfInterest());
	}
}
//Classes SBI,ICICI and AXIS inherits the same class BANK(single parent,multiple child)
//getRateOfInterest method of parent class is over ridden in child classes.