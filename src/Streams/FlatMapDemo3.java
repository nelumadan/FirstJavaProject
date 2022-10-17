package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String sname;
	int sno;
	char grade;
	
	Student(String sname,int sno,char grade)
	{
		this.sname=sname;
		this.sno=sno;
		this.grade=grade;
	}
}
public class FlatMapDemo3 
{
	public static void main(String[] args) 
	{
		List<Student> list1=Arrays.asList(new Student("smith",101,'A'),new Student("john",102,'B'));
		List<Student> list2=Arrays.asList(new Student("ken",103,'C'),new Student("scott",104,'D'));
		List<List<Student>> combinedList=Arrays.asList(list1,list2);
		
		//using flatMap to create finalList of all names then using map to convert to uppercase
		List<String> finalList=combinedList.stream().flatMap(list->list.stream()).map(name->name.sname.toUpperCase()).collect(Collectors.toList());
		System.out.println(finalList);
	}
}
