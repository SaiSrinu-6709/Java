class Student
{
   int id = 1;
   String name = "sai";
   double salary = 1000.0;

   public void work()
   {
      System.out.println("working");
   }
public static void main (String[] args)
{
Student s=new Student();
System.out.println(s.id);
System.out.println(s.name);
System.out.println(s.salary);
s.work();
}
}
