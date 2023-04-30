import java.util.*;
class aa{
   
    public static void printarr(int m[],int n,int o)
    {
        int b[]=new int[o];
        for(int i=0;i<n;i++)
        {
            System.out.println(m[i]);
        }
        int arrr[]=new int[o];
        arrr=m;
        System.out.println("The copied array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arrr[i]);
        }
        System.out.println("Actual ele in array");
        int len=o-n;
        for(int k=0;k<o;k++)
            {
                System.out.println(m[k]);
            }
        System.out.println("Rem ele in array");
        for(int j=n,k=0;j<o;j++,k++)
        {
                b[k]=m[j];
        }
        for(int k=0;k<o;k++)
            {
                System.out.println(b[k]);
            }
            int lenn=o-n;
            for(int k=lenn,j=0;k<o;k++,j++)
            {
                b[k]=arrr[j];
            }
            System.out.println("The traversed array is ");
            for(int k=0;k<o;k++)
            {
                System.out.println(b[k]);
            }
    }
}
public class arraytraversal
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]={1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the num from which reversal happen ");
		int a=sc.nextInt();
		System.out.println("Enter the length of num");
		int b=arr.length;
		aa.printarr(arr,a,b);
		
		
	}
}
