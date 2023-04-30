import java.util.*;
public class armstrongnum
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=n;
		int rem=1,temp=0;
		while(n>=1)
		{
		    rem=n%10;
		    temp=temp+(rem*rem*rem);
		    n=n/10;
		    
		}
		System.out.println(temp);
		if(temp==c)
		{
			System.out.println("YES");	
		}
	else
		{
			System.out.println("NO");	
		}
	    	
	}
}
