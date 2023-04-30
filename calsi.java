import java.io.*;
import java.util.*;
public class calsi {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 2 Num");
         int i=sc.nextInt();
         int j=sc.nextInt();
         System.out.println("Enter the operation to be per");
         char op=sc.next().charAt(0);
	 int c;
         switch(op)
         {
             case '+' :
                 System.out.println("The operation performed is " + op + "and ans is " + i+j);
                 break;
            case '-' :
		 c=i-j;
                 System.out.println("The operation performed is " + op + "and ans is " + c );
                 break;
            case '*' :
                 System.out.println("The operation performed is " + op + "and ans is " + i*j);
                 break;
            case '/' :
                 System.out.println("The operation performed is " + op + "and ans is " + i/j);
                 break;
     
         }
         
    }
}