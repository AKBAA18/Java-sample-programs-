/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Arrays;
class aa{
    public static void reverrse(int m[],int n)
    {
        int temp;
        System.out.println("The actual array is " );
        for(int i=0;i<n;i++)
        {
            System.out.print(m[i] +  " ");
        }
        System.out.println();
        Arrays.sort(m);
        System.out.println("Array after sort is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        System.out.println("Array after reverse is ");
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            temp=m[i];
            m[i]=m[j];
            m[j]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(m[i] + " ");
        }
        
    }
}
public class arrayrev
{
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		int arr[]={11,02,23,14,35,60,17,18,29,30};
		Scanner sc=new Scanner(System.in);
		int b=arr.length;
		System.out.println("THE length of array is "+b);
		aa obj=new aa();
		obj.reverrse(arr,b);
		
	}
}
