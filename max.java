import java.util.Arrays;
import java.util.Scanner;
class max
{
    public static void main(String[] args)
     {
       Scanner s=new Scanner(System.in);

       int size;
       size=s.nextInt();
       int[] ar=new int[size];
       int mx=ar[0];
       //int mn=ar[0];
       for (int i = 0; i < size; i++) {
           ar[i]=s.nextInt();
       }
       System.out.println(Arrays.toString(ar));
       for (int i = 0; i < size; i++)
           {
            if (mx < ar[i])
            {
                mx=ar[i];
            }}
            int mn=ar[0];

       for (int i = 0; i < size; i++)
        {   
         if (mn>ar[i])
            {
                mn=ar[i];
            }
            }
           
        System.out.println("max="+mx);
        System.out.println("min="+mn);
        System.out.println("K P C S S PAVAN");
        System.err.println("22NQ1A0548"); 
              }
    
    }