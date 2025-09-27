class One
{
   int i = 10;
   int j = 20;
}

public class Instance1
{
   public static void main(String[] args)
   {
      One obj1 = new One();
      One obj2 = new One();

      System.out.println(obj1.i + " -- " + obj1.j);  //10 -- 20
      System.out.println(obj2.i + " -- " + obj2.j);  //10 -- 20

      obj1.i = 88;
      obj1.j = 99;

      System.out.println(obj1.i + " -- " + obj1.j);  //88 -- 99
      System.out.println(obj2.i + " -- " + obj2.j);  //10 -- 20
   }
}