//Method without parameters and
// Without Return statement


class Calculate
{
 public void add()
 {
  int a=10,b=20,c;
  c=a+b;
  System.out.println(c);
 }
}
public class Category1
{
 public static void main(String args[])
 {
 Calculate obj=new Calculate();
 obj.add();
}
}