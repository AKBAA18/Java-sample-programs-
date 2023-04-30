import java.util.*;
import java.io.*;
public class facrec{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num to find factorial ");
        int num=sc.nextInt();
        facc(num);
    }
    public static int facc(int j){
    	float fac=1;
    	for(int i=1;i<=j;i++)
    	{
       	    fac=fac*i;
    	}
	System.out.println(fac);
	return 0;
    }
}