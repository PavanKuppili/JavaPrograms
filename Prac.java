import java.util.Arrays;
import java.util.Scanner;
public class Prac
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size;
        System.out.println("enter size");
        size=s.nextInt();
        int [] arr= new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}