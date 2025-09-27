public class ContinueExample1
{
 public static void main (String[] args)
 {
  for(int i=1;i<=10;i++)
  {  
   System.out.println(i);
   System.out.println("Did not skip");
   if(i<=5)
   continue;
  }
 System.out.println("Outside the loop");
}
}