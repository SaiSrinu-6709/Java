public class SumofOdd
{
 public static void main(String args[])
 {
  int n=100;
  int sum=0;
  for(int i=1;i<=n;i++)
  { 
   if(i%2!=0)
   sum=sum+i;
  }
System.out.println("SUM of 100 Odd numbers is.."+sum);
}
}