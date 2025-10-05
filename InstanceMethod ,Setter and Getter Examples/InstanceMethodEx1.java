class One
{
 int a=10; 		//instance variable
 static int b=20; 	 //static variable
 public void Methodone() //instance method or non-static method

 {
  System.out.println(a+b);
 }
}
public class InstanceMethodEx1
{
 public static void main(String args[])
 {
  One obj=new One();
 obj.Methodone();
}
}