class One
{
 static int a=10;		//Static variable
 static int b=20;		//Static varaiable
 int c=100;			//Instance variable
 public static void Methodone()		//Static Method
 {
 System.out.println("Sum is :"+(a+b));
 //System.out.println(c);	//Instance variable cannot be accessed in the static method
 }
}
public class StaticMethodEx1
{
 public static void main(String[] args)
 { 
   System.out.println("First number is "+One.a);
   System.out.println("Second number is"+One.b);
   One.Methodone();
 }
}
