package Arrays_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayToArrayList 
{
	public static void main(String[] args) 
	{
		Integer[] arr= {12, 34, 45};
		List list=Arrays.asList(arr);
		System.out.println(list);
	}
}
