import java.util.*;
import java.io.*;
public class fib{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the num to which fibonacci to be found out");
        int num=sc.nextInt();
        int a=0,b=1,c=0,i;
        for(i=0;i<num;i++)
        {
            c=a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}