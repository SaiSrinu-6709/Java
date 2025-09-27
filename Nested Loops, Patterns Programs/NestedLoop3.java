public class NestedLoop3
{ 
 public static void main(String args[]) 		//output:
 {						    //	5 4 3 2 1
  for(int i=1;i<=5;i++)				    //	5 4 3 2
  {						//	5 4 3
   for(int j=5;j>=i;j--)			//	5 4
   { 						//	5
    System.out.print(j +" ");
   }
System.out.println();
}
}
}