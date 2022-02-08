package AccessModifier2;

import AccessModifier1.accessModifiers;//importing class from another package

public class access2 extends accessModifiers//can inherit class from another package after importing that
{
	public static void main(String[] args) 
	{
		accessModifiers obj = new accessModifiers();//object can be created of class from another package by importing that class
		obj.c=60;//variable from class in another package can be accessed only if it is public
		obj.print();//method from class in another package can be accessed only if it is public
		
		access2 object = new access2();//have to create an object of current class
		object.d=100;//protected variable from class in another package accessed through inheritance
		object.reveal();//protected method from class in another package accessed through inheritance
	}
}
