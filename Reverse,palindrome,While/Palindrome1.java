public class Palindrome1
{
 public static void main(String[] args)
  { 
   int n=707;
   int reverse=0,b;
   int a=n;
   while(n>0)
   { 
    b=n%10;
    reverse=reverse*10+b;
    n=n/10;
   }
if(a==reverse)
System.out.println("Number is palindrome"+reverse);
else
System.out.println("Number is not palindrome");
}
}