public class ContinueExample2
{
 public static void main(String[] args)
 {
  int n=1;
  while(n<=10)
  {
  if(n>=6)
   { 
    n++;
    continue;
   }
  System.out.println(n);
  n++;
  }
}
}