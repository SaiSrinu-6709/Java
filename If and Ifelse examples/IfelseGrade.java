public class IfelseGrade
{
 public static void main(String[] args)
 {
  int a=100,b=45,c=70;
  int total=a+b+c;
  int average=total/3;
  if(average>=75)
  System.out.println("GradeA");
  else if(average<75 && average>=65)
  System.out.println("GradeB");
  else if(average<65 && average>=55)
  System.out.println("GradeC");
  else if(average<55 && average>=45)
  System.out.println("GradeD");
  else
  System.out.println("Fail");
}
}
 