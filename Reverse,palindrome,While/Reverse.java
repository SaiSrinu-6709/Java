public class Reverse
{ 
 public static void main(String[] args)
  {
   int n=43528;
   int reverse=0;
   int a;
   while(n>0)
    { 
     a=n%10;
     reverse=reverse*10+a;
     n=n/10;
     }
System.out.println("Reverse of a number is"+reverse);
}
}
     