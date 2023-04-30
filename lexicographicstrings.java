import java.io.*;
import java.util.*;

public class lexicographicstrings{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
	System.out.println("Length of entered string is " + s.length());
        String currStr= s.substring(0, k);
        String lexMin = currStr;
        String lexMax = currStr;
        for(int i=k;i<s.length();i++)
        {
            currStr = currStr.substring(1, k) + s.charAt(i);
	    System.out.println("Spliting " + currStr);
            if (lexMax.compareTo(currStr) < 0)    
                 lexMax = currStr;
            if (lexMin.compareTo(currStr) > 0)
                 lexMin = currStr;           
        }
 
        // Print result.
        System.out.println(lexMin);
        System.out.println(lexMax);
        }
        

}