public class NestedLoop2
{ 
 public static void main(String args[])    //output :
 {					   //	1					
  for(int i=1;i<=5;i++)			  //	1 2
  {					  //	1 2 3
   for(int j=1;j<=i;j++)		   //	1 2 3 4
   {					   //   1 2 3 4 5 
    System.out.print(j +" ");
   }
System.out.println();
}
}
}