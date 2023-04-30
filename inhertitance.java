import java.util.*;
class cars{
    int cost[];
    String model[],type[];
    Scanner sc=new Scanner(System.in);
    void ipgettype(int lennn)
    {
        for(int i=0;i<lennn;i++)
        {
            type[i]=sc.nextLine();
        }
}
     void ipgetmodel(int len)
        for(int i=0;i<lennn;i++)
        {
            model[i]=sc.nextLine();
        }
}
	void ipgetcost(int len)
        for(int i=0;i<lennn;i++)
        {
            cost[i]=sc.nextInt();
        }

	  }
    }
} 
class printing extends cars{
void printtype(int lenn){    
for(int i=0;i<lenn;i++)
        {
            System.out.print(type[i] +" ");
        }
        System.out.println();
}
void printmodel(int lenn){
        for(int i=0;i<lenn;i++)
        {
            System.out.print(model[i] +" ");
        }
        System.out.println();
}
void printcost(int lenn){
        for(int i=0;i<lenn;i++)
        {
            System.out.print(cost[i] +" ");
        }
        System.out.println();}
}
class inhertitance{
    public static void main(String ar[])
    {
        cars obj=new cars();
        printing obj1=new printing();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        obj.ipgettype(n);
        obj1.printmodel(5);
    }
}