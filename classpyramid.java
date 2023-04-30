/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public classpyramid
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int j=n-1;j>=i;j--)
		    {
		        System.out.print("  ");
		        
		    }
		    for(int k=1;k<=i;k++)
		    
		    {
		        System.out.print(" *");
		        a=0;
		    }
		    for(int l=2;l<=i;l++)
		    {
		        System.out.print(" *");
		    }
		    System.out.println();
		}
	}
}
