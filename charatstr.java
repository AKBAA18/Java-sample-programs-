import java.util.*;
public class charatstr{

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c=sc.next().charAt(0);
		int index=str.indexOf(c);
		System.out.println(index);
		System.out.print(str.substring(0,index));

	}
}