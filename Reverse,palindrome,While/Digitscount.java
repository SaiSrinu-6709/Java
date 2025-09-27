public class Digitscount
{
 public static void main(String[] args)
 {
  int number=0,a;
  int count=0;
  while(number>0)
  { 
   a=number%10;
   count=count+1;
   number=number/10;
   }
System.out.println("No. of digits are : "+""+count);
}
}
