/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package delimeterinjava;
import java.util.*;
/**
 *
 * @author aksha
 */
public class Delimeterinjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
	String name[]=new String[n];
	for(int i=0;i<n;i++)
	{
            name[i]=sc.next();
	}
	String a[]=name[0].split(":");
        int marks[]=new int[3];
        for(int i=0,j=1;i<3;i++,j++)
        {
            marks[i]=Integer.parseInt(a[j]) ;
        }
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
            
	//System.out.println(tot);
    }
    
}
