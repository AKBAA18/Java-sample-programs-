import java.util.*;
public class deletechar {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ar=sc.nextLine();
		boolean b=true;
		StringBuilder str=new StringBuilder(ar);
		while(b)
		{
		    str=str.deleteCharAt(0);
		    
		}
		System.out.println(str);
        
    }
}