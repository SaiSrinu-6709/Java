public class Factorial
{
 public static void main(String[] args)
{ 
 int n=5;
 int fact=1;
 while(n>0)
 {
  fact=fact*n;
  n=n-1;
 }
System.out.println("Factorial of Number is"+fact);
}
}