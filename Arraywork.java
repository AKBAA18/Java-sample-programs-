/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraywork;

/**
 *
 * @author aksha
 */
import java.util.*;
public class Arraywork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        int max;
        int min;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(a[j]>a[i])
            {
                max=a[j];
                a[j]=a[i];
                a[i]=max;
            }
            }
        }
        System.out.println("Array is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=0,j=n-1;i<=n/2&& j>=(n/2);i++,j--)
        {
            
                System.out.print(a[i]+ " " + a[j] + " ");
            
        }
    }
    
}
