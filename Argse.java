
import java.util.*;

class Argse
{

 void result(int v,int e)
 {
    System.out.println("rectangele:"+v*e);
 }
 void result(int s)
 {
    System.out.println("square:"+s*s);
 }
 public static void main(String[] args)
 {
 int c=0;
 int [] arr=new int[3];
 Argse obj=new Argse();
 for(String arg:args)
     {
   
     int n=Integer.parseInt(arg);
      arr[c]=n;
      c+=1;
      }
      System.err.println(Arrays.toString(arr));
     if (c==1)
     {
      obj.result(arr[0]);
     }
     else if(c==2)
     {
      obj.result(arr[0],arr[1]);
     }
 }
}