import java.io.*;
import java.util.*;

public class Datatypes{

    public static void main(String[] args) {
        long a=-9223372036854775808L;
	long b=9223372036854775807L;
	Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
	try{
            if(i>=-128 && i<=127){
                System.out.println("THE NUMBER " + i + " CAN BE FITTED IN BYTE DT") ;
            }
            if (i>=-32768 && i<=32767){
                System.out.println("THE NUMBER " + i + " CAN BE FITTED IN SHORT DT");
            }
            if(i>= -2147483648 && i<=2147483647){
                System.out.println("THE NUMBER " + i + " CAN BE FITTED IN INT DT");
            }
            if (i>=a && i<=b ){
                System.out.println("THE NUMBER " + i + " CAN BE FITTED IN LONG DT");
            }
	    }
	catch(Exception e)
            {
                System.out.println("Error is " + e);
            }
         
    }
}
