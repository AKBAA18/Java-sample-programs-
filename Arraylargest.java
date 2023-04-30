/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
public class Arraylargest{
    static void larinarr(int arr[],int poss)
    {
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
        int pos=poss;
        int n=pos+3;
        int temp=0;
        for(int i=pos;i<n;i++)
        {
            for(int j=pos;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                  temp=arr[i];   
                }
            }
        }
        System.out.print(temp + " ");
        int last=arr.length-3;
        if(pos<last)
        {
//            for(int i=0;i<arr.length-1;i++)
//            {
//                arr[i]=arr[i+1];
//            }
            pos=pos+1;
            larinarr(arr,pos);
        }
        
    }

    
    public static void main(String[] args) {
        //System.out.println("HI");
        int array[]={18,7,6,7,5,9,2};
        larinarr(array,0);
    }
    
}
