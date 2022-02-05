package accessModifiers2;

import accessModifiers1.AccessModifier1;//importing class from another package

public class AcessModifier2
{
	public static void main(String[] args)
	{
		AccessModifier1 am1 = new AccessModifier1();//object can be created of class from another package by importing that class
		am1.i = 30;//variable from class in another package can be accessed only if it is public
		am1.m1();//method from class in another package can be accessed only if it is public
	}
}
