/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvc
 */
import java.io.*;
import java.util.*;
public class playFair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a[][]=new char[5][5];
        char ch=(char)97;
        int flag=0;
        System.out.println("Enter the keyword: ");
        String str=sc.nextLine();
        int len=str.length();
        int i=0,j=0,count=0;
    outer:for( i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(count<len){
                    a[i][j]=str.charAt(count);
                    count++;
                }
                else
                {
                    break outer;
                }
            }
            System.out.println();
            
        }
        
        
        for(;i<5;i++)
        {
            for(;j<5;j++)
            {
                for(int k=a;k<=z;k++)
                {
                    
                a[i][j]=ch; 
                ch++;
            }
            j=0;
            System.out.println();
            
        }
        
        System.out.println("out :");
        for(i=0;i<5;i++)
        {
            for( j=0;j<5;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
