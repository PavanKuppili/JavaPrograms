import java.util.Arrays;
import java.util.Scanner;
class median
{
    public static void main(String[] args)
     {
       Scanner s=new Scanner(System.in);

       int size;
       size=s.nextInt();
       int[] ar=new int[size];
       for (int i = 0; i < size; i++) {
           ar[i]=s.nextInt();
       }
       Arrays.sort(ar);
       System.out.println(Arrays.toString(ar));
       int mid =(size)/2;
       System.out.println("median="+ar[mid]);
       }
     }