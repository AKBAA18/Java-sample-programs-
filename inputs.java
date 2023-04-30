import java.io.*;
import java.util.*;

class inputss {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();
        if (n % 2 == 0 && (n >= 2 && n < 5)) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && (n >= 6 && n < 20)) {
            System.out.print("Weird");
        } else if (n % 2 == 0 && (n >= 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

    }
}
