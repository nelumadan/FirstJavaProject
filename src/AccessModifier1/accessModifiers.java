package AccessModifier1;

public class accessModifiers 
{
 private int a;
 private void show()
 {
	 System.out.println(a);
 }
 
 int b;//by default access modifier is default
 void display()//by default access modifier is default
 {
	 System.out.println(b);
 }
 
 public int c;
 public void print()
 {
	System.out.println(c);
 } 
 
 protected int d;
 protected void reveal()
 {
	 System.out.println(d);
 }
}
