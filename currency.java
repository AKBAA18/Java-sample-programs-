/*import java.io.*;
import java.util.*;
import java.text.NumberFormat;
public class currency{

    public static void main(String[] args) {
	NumberFormat formats=NumberFormat.getInstance();
	Scanner sc=new Scanner(System.in);
        float i=sc.nextFloat();
	double a=i*0.013;
	double b=i*1;
	double c=i*0.16;
	double d=i*0.012;
        System.out.println("US: $" + a);
        System.out.println("India: Rs." + b);
        System.out.println("China: ￥" + c);
        System.out.println("France: " + d + " €");
    }
}
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class currency{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();	
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);//locale represent specific geographic location
         String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
          String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
           String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}