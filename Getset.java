/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getset;
import java.util.*;
class operations{
    static String varname[]=new String [10];
    static int values[]=new int [10];
    static int t=0;
    static count=0;
    int index;
    void setname(String name,int value)
    {
        varname[t]=name;
        values[t]=value;
        t++;
        System.out.println("VAR AND VAL UPDATED SUCCESSFULLY");
    }
    void getname(){
        if(t==0)
        {
            System.out.println("NO VAR AND VALUES RECORDED  ");
        }
        else{
        for(int i=0;i<t;i++)
             {
                  System.out.println("THE VAR NAME IS "+varname[i] +" THE VALUE IS " +  values[i]);
             }
        }
    }
    void unsetvar(String strunset){
        for(int i=0;i<t;i++)
        {
            if(varname[i].equals(strunset) ){
                index=i;
                varname[i]=varname[i+1];
                values[i]=values[i+1];
                t--;
            }
        }
        System.out.println("UNSET OF VAR "+ strunset + " DONE ");
        
        
    }
    void numequalto(int num){
        for(int i=0;i<t;i++)
        {
            if(values[i]==num)
            {
                count++;
            }
        }
        System.out.println("THE VALUE REPEATED " + count + " TIMES ");
    }
    
}
public class Getset{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        operations ope=new operations();
        boolean poll=true;
        while(poll)
        {
            System.out.println();
            System.out.println("  1.SET NAME \n  2.GET NAME \n  3.UNSET NAME \n  4.NUMEQUALTIO");
            System.out.println("ENTER YOUR OPTIONS   ");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("ENTER THE VAR NAME :");
                    String name=sc.next();
                    System.out.println("ENTER THE VALUE OF VAR");
                    int value=sc.nextInt();
                    ope.setname(name,value);
                    //System.out.println("ENTERED VAR IS " + name +"VALUE IS " + value);
                    break;
                case 2:
                    System.out.println("THE ENTERED VALUES ARE ");
                    ope.getname();
                    break;
                case 3:
                    System.out.println("ENTER THE VAR NAME TO BE UNSET ");
                    String strunset=sc.next();
                    ope.unsetvar(strunset);
                    break;
                case 4:
                    System.out.println("ENTER THE VALUE TO BE SEARCHED ");
                    int num=sc.nextInt();
                    ope.numequalto(num);
                    break;
                case  5:
                    poll=false;
                    break;
                default:
                    System.out.println("ENTER CORRECTLY BET 1-5");
                    break;
                    
            }
        }
    }
    
}
