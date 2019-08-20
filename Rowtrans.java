import java.util.*;





public class Rowtrans{
    
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter plain text: ");
        String str=sc.nextLine();
        System.out.println("enter key length: ");
        int n=sc.nextInt();
        int len=0;
        if(str.length()%n!=0)
        {
             len=(str.length()/n)+1;
        }
        else
        {
             len=(str.length()/n);
        }
        
        
        ArrayList a=new ArrayList(n);
        char m[][]=new char[n][n];
        String nstr="";
        
        System.out.println("enter key : ");
        for(int i=0;i<n;i++)
        {
           a.add(sc.nextInt(i));
        }
        
        System.out.println("your key is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("your matrix: ");
        int x=0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(x>(str.length()-1))
                {
                    m[i][j]='x';
                }
                else
                {
                    m[i][j]=str.charAt(x);
                    x++;
                }
            }
        }
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }
}