// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class arrsplit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[] =new String [100];
        String arr1[]=new String [100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
		//System.out.println(arr[i]);
        }

	   for(int i=0;i<n;i++)
        {
            
		System.out.println(arr[i]);
        }

        
    }
}