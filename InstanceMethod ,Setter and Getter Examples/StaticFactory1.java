class Bike
{
 int regNo=98;
  public void ready()
  {
   System.out.println("Bike is ready");
  }
 }
class BikeFactory 				 //factory class
{
 public static Bike bikeMethod()		 //static factory method 
 {
  Bike b=new Bike();
  return b;
 }
}
public class StaticFactory1
{
public static void main(String[] args)
{
 Bike b=BikeFactory.bikeMethod();         // Here No need to create object of BikeFactory 
 System.out.println(b);			  // class because the method of that class is 	
 b.ready();				 // static.	 
 System.out.println("Bike number is :"+b.regNo);
 }
}