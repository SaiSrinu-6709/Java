public class PrimeNo
{
 public static void main(String args[])
 {
  int n=10;
  int factors=0;
  for(int i=1;i<=n;i++)
  {  
  if(n%i==0)
  factors=factors+1; 
  }
  if(factors==2)
  System.out.println(n+"  "+"Is a prime number");
  else
  System.out.println(n+"  "+"Is not a prime number");
}
}

   