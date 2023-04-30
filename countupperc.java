import java.util.*;
public class countupperc {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a;
		int c=str.length();
		int b=0;
		boolean aa=true;
		for(int i=0;i<c;i++)
		{
		    a=str.charAt(i);
		    if((int)a<=96)
		    {
			aa=true;
		      b=b+1; 
		    }
		    else{
		        aa=false;
		    }
		}
        if(aa)
        {
            System.out.println(b);
        }
        else{
            System.out.println(b);
        }
	}
}