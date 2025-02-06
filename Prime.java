import java.util.*;
class Prime
{
 public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   int n1;
   System.out.print("enter n1:::");
   n1=s.nextInt();
   int n2;
   System.out.print("enter n1:::");
   n2=s.nextInt();
   System.out.println("prime numbers in between"+n1+"and"+n2+"--");
   for(int i=n1;i<n2;i++)
     {
      int tgt = i;
      boolean flag=false;
       for (int j=2;j<tgt/2;j++)
         {
           if (tgt %j==0)
            {
             flag=true;
            }
         }
      if (flag==false)
       {
        System.out.println(tgt);
       }
     }

   }
}