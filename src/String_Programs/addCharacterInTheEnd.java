package String_Programs;

import java.util.Scanner;

public class addCharacterInTheEnd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String string = sc.nextLine();
		
		string=string + "d";
		System.out.println(string);
	}
}
