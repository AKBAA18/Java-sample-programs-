import java.util.*;
public class diamond
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner (System.in);
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
		    }
		    for(int l=2;l<=i;l++)
		    {
		        System.out.print(" *");
		    }
		    /*for(int m=1;m<=n-2;m++)
		    {
		        System.out.print(" *");
		    }*/
		    System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("  ");
		        
		    }
		    for(int k=n-1;k>=i;k--)
		    {
		        System.out.print(" *");
		    }
		    for(int l=n-2;l>=i;l--)
		    {
		        System.out.print( " *");
		    }
		    System.out.println();
		}
	}
}
