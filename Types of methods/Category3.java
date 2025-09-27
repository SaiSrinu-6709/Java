//Method With parameters and
// Without Return statement
  
class Calculate
{
 public void Sum(int n1,int n2)
 {
  int c=n1+n2;
  System.out.println(c);
 }
 }
public class Category3
{
 public static void main(String[] args)
 {
  Calculate obj=new Calculate();
  obj.Sum(20,30);
}
}