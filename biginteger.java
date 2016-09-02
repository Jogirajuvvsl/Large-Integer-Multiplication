import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class biginteger{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
      
      
        BigInteger a1=BigInteger.valueOf(a);
        BigInteger b1=BigInteger.valueOf(b);
        BigInteger c1=BigInteger.ZERO;
        BigInteger n=BigInteger.ZERO;
        BigInteger d1;
        for (int i=1; i<=c-2;i++)
        {
        
        c1=a1.add(b1.multiply(b1)); 
        a1=b1; 
        b1=c1;
        
            
         }

       System.out.println(c1);
}

}