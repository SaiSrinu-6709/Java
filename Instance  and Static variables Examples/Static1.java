class Variables
{
 int i=10;
 static int j=20;
}
public class Static1
{
 public static void main(String args[])
 {
  Variables obj1=new Variables();
  Variables obj2=new Variables();
  System.out.println(obj1.i+" -- "+obj1.j);  // 10 -- 20
  System.out.println(obj2.i+" -- "+obj2.j);  // 10 -- 20
  
  obj1.i=88;
  obj1.j=99; 


  System.out.println(obj1.i+" -- "+obj1.j);  // 88 -- 99
  System.out.println(obj2.i+" -- "+obj2.j);  // 10 -- 99
}
}

  