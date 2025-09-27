//Method without parameters and
// With Return statement


class Calculate
{
 public int add()
 {
  int a=10,b=20,c;
  return c=a+b;
   }
}
public class Category2
{
 public static void main(String args[])
 {
 Calculate obj=new Calculate();
 int res=obj.add();
 System.out.println(res);
}
}