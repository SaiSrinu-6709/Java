class Animal
 {
	public void Eat()
	{
	 System.out.println("Eating");
	}
public void Sleep()
 {
	System.out.println("Sleeping");
	}
}
 class Dog extends Animal
{
	public void Bark()
	{
	 System.out.println("Barking");
	}
	public void run()
	{
	 System.out.println("running");
	}
}
public class Inheritance
{
public static void main(String[] args)
{
Dog d=new Dog();
d.Eat();
d.Sleep();
d.Bark();
d.run();
}
}

