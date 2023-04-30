/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class deletioninarray{
    public static void main(String ar[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        a=sc.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter a num to be deleted at a pos ");
        int pos=sc.nextInt();
	System.out.println("How many num to be deleted");
	int b=sc.nextInt();
	a=a-b;
        for(int j=pos-1;j<=a;j++)
        {
            arr[j]=arr[j+1];
        }
        int len=arr.length;
		System.out.println(len);
	for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]);
        }
        
        
    }
} 