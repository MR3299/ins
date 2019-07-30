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
public class playFair1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char n1[][]=new char[5][5];
        int ch='a';
        char z=66,x=90;
        int flag=0;
         System.out.println("Enter the plain text: ");
        String pt=sc.nextLine();
        System.out.println("Enter the keyword: ");
        String str=sc.nextLine();
        String temp="";
        int len=str.length();
        int i=0,j=0,count=0;
        int p=0,q=0,r=0,s=0;
    outer:for( i=0;i<5;i++)
        {
            for(j=0;j<5;)
            {
                if(count<len){
                    if(temp.indexOf(str.charAt(count))==-1)
                    {
                    n1[i][j]=str.charAt(count);
                    temp+=n1[i][j];
                    count++;
                    j++;
                    }
                    else
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
            for(;j<5;)
            {
                if(temp.indexOf('j')==-1)
                {
                    if(temp.indexOf(ch)==-1 && ch!='j'){
                        n1[i][j]=(char)ch;
                        temp += ch;
                        ch++;j++;
                    }
                    else{    
                        ch++;
                    }
                }
                if(temp.indexOf('i')==-1)
                {
                    if(temp.indexOf(ch)==-1 && ch!='i'){
                        n1[i][j]=(char)ch;
                        temp += ch;
                        ch++;j++;
                    }
                    else{    
                        ch++;
                    }
                }
            }
            j=0;
            System.out.println();
            
        }
       
        
        System.out.println("out :");
        for(i=0;i<5;i++)
        {
            for( j=0;j<5;j++)
            {
                System.out.print(n1[i][j]);
            }
            System.out.println();
        }
        
        //int ptlen=pt.length();
        for(i=0;i<pt.length();)
        {
            if(i+1<pt.length())
            {   
                if(pt.charAt(i)==pt.charAt(i+1))
                {
                    pt=pt.substring(0,i+1)+'x'+pt.substring(i+1);
          //          System.out.println(pt);
                    i=0;
                }
                else
                    i=i+2;
            }
            else
                break;
        }
        if(pt.length()%2!=0)
        {
            pt=pt+'x';
        }
        System.out.println(pt);
        
        System.out.println("output ");
        for(int k=0;k<pt.length();k+=2)
        {
            for(i=0;i<5;i++)
            {
                for( j=0;j<5;j++)
                {
                    if(pt.charAt(k)==n1[i][j])
                    {
                        q=i;
                        p=j;
                    //System.out.print(n1[p][q]);
                    }
                    
                }
            }
            for(i=0;i<5;i++)
            {
                for( j=0;j<5;j++)
                {
                   
                    if(pt.charAt(k+1)==n1[i][j])
                    {
                         r=j;
                         s=i;
                    //System.out.print(n1[p][q]);
                    }
            
                    
                }
            }
                    if(p==r)
                    {   if(q>4) q=0;
                        if(s>4) s=0; 
                        else{ q++;s++;}
                            System.out.print(n1[q][r]);
                            System.out.print(n1[s][p]);
                        
                    }
                    else if(q==s)
                    {
                        if(r>4) r=0;
                        if(p>4) p=0; 
                        else{ r++;p++;}
                            System.out.print(n1[q][r]);
                            System.out.print(n1[s][p]);
                    }
                    else
                    {
                        System.out.print(n1[q][r]);
                        System.out.print(n1[s][p]);
                        
                      } 
            //}
        }
    }
}
