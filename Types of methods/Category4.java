//Method With parameters and
//       With Return statement
  
class Calculate
{
 public int Sum(int n1,int n2)
 {
  int c=n1+n2;
  return c;
 }
 }
public class Category4
{
 public static void main(String[] args)
 {
  Calculate obj=new Calculate();
  int res=obj.Sum(20,30);
  System.out.println(res);
  System.out.println(obj.Sum(20,20));
}
}