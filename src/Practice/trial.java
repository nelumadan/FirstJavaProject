package Practice;

import java.util.HashSet;

public class trial 
{
	public static void main(String[] args) 
	{
		String[] string = {"java", "c", "java", "c++", "python", "java", "python", "c"};
		HashSet<String> duplicate=new HashSet<String>();
		int count=0;
		
		for(int i=0;i<string.length;i++)
		{
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					count++;
					if(duplicate.add(string[i])==true)
						System.out.println(string[i] +"-"+ count);
				}
			}
		}
	}
}
