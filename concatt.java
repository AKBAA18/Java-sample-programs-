import java.util.Arrays;
public class concatt
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]={1,2,3,4,5,6};
		int b[]={1,2,3,4,5,6};
		int aa=a.length;
		int bb=b.length;
		int result[]=new int[aa+bb];
		System.arraycopy(a,0,result,aa);
		System.arraycopy(b,0,result,aa,bb);
		for(int i=0;i<aa+bb;i++)
		{
		    System.out.println(result[i]);
		}
System.out.println(Arrays.toString(result));
	}
}
