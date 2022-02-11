package String_Programs;

public class frequencyOfElements 
{

	public static void main(String[] args) 
	{
		String[] str= {"java","c","python","java","c++","python","java"};
		int freq[] = new int[str.length];
		
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					count++;
					freq[j]=1;
				}
				
			}
			if(freq[i]==0)
		        System.out.println(str[i] + " - " + count);
		}

	}

}
