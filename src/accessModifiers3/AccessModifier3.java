package accessModifiers3;

import accessModifiers1.AccessModifier1;

public class AccessModifier3 extends AccessModifier1//can inherit class from another package after importing that
{
	public static void main(String[] args)
	{
		AccessModifier3 am3 = new AccessModifier3();//have to create an object of current class
		am3.j = 30;//protected variable from class in another package accessed through inheritance
		am3.m2();//protected method from class in another package accessed through inheritance
	}
}
