
package javaapplication1;

import java.util.Scanner;


public class Monoalpcipher{

    
    public static void main(String[] args) {
        int i,j,k;
         
        char ch,rs;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message: ");
        String str=sc.nextLine();
        
        System.out.println("Enter the key: ");
        String key=sc.nextLine();
        int l=str.length();
        System.out.print("MonoalCipher: ");
        
        String rst="";
        
        for(i=0;i<l;i++)
        {
            j=(int)str.charAt(i);
            ch=str.charAt(i);
            //System.out.println(j);
            if(ch !=' ')
            {
                
            
            k=j-97;
           
            System.out.print(key.charAt(k));
            rst=rst+key.charAt(k);
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
         System.out.println("resultr :"+rst);
         
    }
    
}
//qwertyuiopasdfghjklzxcvbnm