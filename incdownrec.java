// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class incdownrec {//increasedowntraingle
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int a=0;
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(a +  " ");
			a++;
            }
		System.out.println();
        }
    }
}