class Sum
{
 public int add()
 {
  int a=10,b=20,c;
  c=a+b;
  return c;
 }
}
public class Return1
{
 public static void main(String[] args)
 {  
  Sum s=new Sum();
  s.add();
 System.out.println(s.add());
}
}
  