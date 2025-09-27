class Animal
{
  public void Run()
{
}
}
class Dog extends Animal
{
 public void Eat()
   {
   }
}
class InstanceofExample
{
  public static void main(String[] args)
  {
    Animal an=new Animal();
    Dog d=new Dog();
    boolean b1= d instanceof Dog;//true
    boolean b2= d instanceof Animal;//true
    boolean b3= an instanceof Dog;//false
    boolean b4= d instanceof Object;//true
    boolean b5= an instanceof Object;//true
    boolean b6=an instanceof Animal;//true
    System.out.println(""+b1);
    System.out.println(""+b2);
    System.out.println(""+b3);
    System.out.println(""+b4);
    System.out.println(""+b5);
    System.out.println(""+b6);

  }
}