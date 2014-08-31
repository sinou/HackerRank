import java.math.*; 
import java.util.*;
public class Solution{ 
  public static void main(String args[]){ 
       Scanner in = new Scanner(System.in); 
       int t = in.nextInt(); 
        BigInteger a = new BigInteger("0"); 
        BigInteger b = new BigInteger("1"); 
        BigInteger c = new BigInteger("0"); 
        BigInteger q = null; 
       for(int i = 0; i < t; i++){ 
         q = new BigInteger(in.next()+"");
         while(c.compareTo(q)<=0){ 
           if(c.equals(q)) {
             System.out.println("IsFibo");
             break;
           }
         	c = a.add(b); 
         	a = b; 
         	b = c; 
         } 
           if(!c.equals(q)) {
             System.out.println("IsNotFibo");
           }
        a = new BigInteger("0"); 
        b = new BigInteger("1"); 
        c = new BigInteger("0"); 
       } 
} 
} 
