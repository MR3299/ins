package javaapplication1;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class cryptana {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
                int count=0;
                 
                 String str="etaonrishdlfcmugypwbvkjxqz";
                 BufferedReader r=new BufferedReader(new FileReader("C:\\Users\\s16it05\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\mr.txt"));
                 
                 String m=r.readLine();
                 System.out.println(m);
                 
                 int l=m.length();
                 for(int i=0;i<l;i++)
                 {
                     char ch=m.charAt(i);
                     
                 }
                 
    }
}
