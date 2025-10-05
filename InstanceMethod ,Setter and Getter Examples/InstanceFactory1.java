class Car
{
 int carRegNo=123;				//assume the procedure to create object of       
public void car()				//Car class using new operator is difficult
{
System.out.println("Car is ready");
}
}
class FactoryClass		 //factory class

{
 public Car carFactory()	   //instance factory method 
 {
  Car c=new Car();
  return c;
 }
 }
public class InstanceFactory1
{
 public static void main(String[] args)
 {
  FactoryClass fc=new  FactoryClass();
  Car c=fc.carFactory();
  System.out.println(c);
  c.car();
}
}
  