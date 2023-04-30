import java.util.LinkedList;
import java.util.*;
/**
 *
 * @author aksha
 */
public class Linkedlistinjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> a=new LinkedList<Integer>();
        //Scanner sc=new Scanner(System.in);
        a.addFirst(100);
	 a.add(200);
	a.add(300);
	 a.add(400);
	a.add(500);
	a.addLast(600);
       a.set(4,5000);
        System.out.println("Enter element in lnked list ");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
    
}
