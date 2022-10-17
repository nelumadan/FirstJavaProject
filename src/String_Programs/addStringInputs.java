package String_Programs;
import java.util.Scanner;

public class addStringInputs 
{
	public static void main(String[] args) 
	{
		String sentence = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("How many words do you want to enter?");
		int count = sc.nextInt();
		
		System.out.println("Enter " +count+ " words");
		String words[] = new String[count+1];
		
		for(int i=0;i<words.length;i++)
		{
			words[i]=sc.nextLine();
		}
		
		for(String w:words)
		{
			sentence = sentence +" "+ w;
		}
		System.out.println(sentence.toUpperCase());
	}
}
