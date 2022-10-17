package oops;

//Wrapper class is used to wrap the values of primitive data types into objects
//because in java everything has to be objects
public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		int i=5;//primitive data type
		Integer ii = new Integer(i);//Boxing or Wrapping(wrapping int value in an object) Integer is a wrapper class
		int j=ii.intValue();//Unboxing or unwrapping(getting the int value out of the object)
		
		//u can also type
//		Integer ii=i;//autoboxing
//		int j=ii;//autounboxing
	}
}
