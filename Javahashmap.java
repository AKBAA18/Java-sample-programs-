
import java.util.HashMap;
/**
 *
 * @author aksha
 */
public class Javahashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,String> str=new HashMap<String,String >();
        str.put("A", "Akshay");
        str.put("S", "BAALAJI");
        str.put("C", "Chris");
        str.put("D", "DEEPAK");
        str.put("K", "KISHORE");
//        for(int i=0;i<str.size();i++)
//        {
//            System.out.println()
//        }
        System.out.println(str);
	for(String i : str.keySet())
	{
		System.out.println("KEY IS  " + i + " VALUE IS " + str.get(i));
	}
    }
    
}