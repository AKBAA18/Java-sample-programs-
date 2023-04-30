/*
import java.io.*;
import java.util.*;

public class areaofp{

    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>=0 && b>=0){
                System.out.println("Area of Parellogram is " + a*b);
            }
        }
        catch(Exception e){
            System.out.println("Breath and Height must be positive ");
        }
    }
}
*/
import java.io.*;
import java.util.*;

public class areaofp {
    private static int a;
    private static int b;
    public static boolean flag;//flag here belong to boolean 
    static {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<=0 || b<=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
           flag=false;
        }
        else{
            flag=true;
        }
        
    }
    public static void main(String[] args) {
       if(flag){
       int area=a*b;
       System.out.println(area);    
           
       }
    }
}

