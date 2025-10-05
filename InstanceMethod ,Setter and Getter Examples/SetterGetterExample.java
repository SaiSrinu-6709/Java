class Employee
{
   int id;  
   String name;
   char gender;
   double salary;

   public void setId(int id) {
      this.id = id;
   }

   public int getId() {
      return id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public char getGender() {
      return gender;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public double getSalary() {
      return salary;
   }
}

public class SetterGetterExample
{
   public static void main(String[] args)
   {
      Employee emp = new Employee();

      emp.setId(1);
      emp.setName("john");
      emp.setGender('m');
      emp.setSalary(1000.0);

      System.out.println(emp.getId());
      System.out.println(emp.getName());
      System.out.println(emp.getGender());
      System.out.println(emp.getSalary());
   }
}