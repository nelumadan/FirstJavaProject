package Streams;

import java.util.Arrays;
import java.util.List;

class Stud
{
	String sname;
	int score;
	
	Stud(String sname,int score)
	{
		this.sname=sname;
		this.score=score;
	}
	
	public String getname()
	{
		return this.sname;
	}
	
	public int getscore()
	{
		return this.score;
	}
}
public class ParallelStreamsDemo 
{
	public static void main(String[] args) 
	{
		List<Stud> list=Arrays.asList(new Stud("smith",55),
									  new Stud("john",82),
									  new Stud("ken",98),
									  new Stud("kennedy",88),
									  new Stud("mark",98),
									  new Stud("john",77),
									  new Stud("smith",60),
									  new Stud("scott",98));
		//using sequential stream
		list.stream().filter(s->s.getscore()>=80)
					 .limit(3)
					 .forEach(stu->System.out.println(stu.getname()+" "+stu.getscore()));
		
		System.out.println("---------");
		//using parallel stream
		list.parallelStream().filter(s->s.getscore()>=80)
		 					 .limit(3)
		 					 .forEach(stu->System.out.println(stu.getname()+" "+stu.getscore()));
		
		System.out.println("----------");
		//convert stream() to parallelStream() then use parallel() method
		list.stream().parallel()
					 .filter(s->s.getscore()>=80)
					 .limit(3)
					 .forEach(stu->System.out.println(stu.getname()+" "+stu.getscore()));
	}
}
