public class Armstrong
{
 public static void main(String[] args)
 { 
  int n=173,a;
  int oldno=n;
  int Armstrong=0;
  while(n>0)
  { 
   a=n%10;
   Armstrong=Armstrong+(a*a*a);
   n=n/10;
  }
if(oldno==Armstrong)
System.out.println("Number is Armstrong");
else
System.out.println("Number is not a Armstrong number");
}
}