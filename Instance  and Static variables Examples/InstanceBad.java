public class InstanceBad
{
   int a = 10;   //instance variable

   public static void main(String[] args)
   {
      //System.out.println(a);  //c.e
      InstanceBad obj = new InstanceBad();
      System.out.println(obj.a);
   }
}