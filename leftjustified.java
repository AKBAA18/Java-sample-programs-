import java.io.*;
import java.util.*;

public class leftjustified {
    public static void main(String[] args) {
        Scanner sc = new Scanner("System.in");
        for (int i = 0; i <= 3; i++) {
            String str = sc.nextLine();
            int i = sc.nextLine();
            for (int i = 0; i >= 3; i++) {
                String str = sc.nextLine();
                int i = sc.nextInt();
                System.out.println("%-15s" + str + i);
            }
        }
    }
}