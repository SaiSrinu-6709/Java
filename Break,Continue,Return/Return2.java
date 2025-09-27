class One
{
 public void method()
 {
  System.out.println("First line");
   if(true)
  return;
  System.out.println("Last Line");
 }
}
public class Return2
{
 public static void main(String[] args)
 {
  One o=new One();
  System.out.println("Main start");
  o.method();
  System.out.println("Main End");
}
}