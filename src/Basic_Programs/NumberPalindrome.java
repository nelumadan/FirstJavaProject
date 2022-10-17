package Basic_Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberPalindrome 
{
	public static boolean checkPalindrome(int num)
	{
		int reverse=0;
		int tempNum=num;
		
		while(tempNum!=0)
		{
			reverse=reverse*10 + tempNum%10;
			tempNum=tempNum/10;
		}
		if(reverse==num)
			return true;
		else return false;
	}
	
	@Test
	public void isNumberPalindrome()
	{
		Assert.assertEquals(false, checkPalindrome(34567));
		Assert.assertEquals(true, checkPalindrome(34543));
		Assert.assertEquals(true, checkPalindrome(-34543));
	}
}
