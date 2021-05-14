package BitManipulation;

import java.util.*;

public class Operator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int b=sc.nextInt();
    System.out.println(Integer.toBinaryString(b));
    
    // //set bit on
    // int i=sc.nextInt();
    // System.out.println(Integer.toBinaryString(b|(1<<i)));
    
    // //set bit off
    // int j=sc.nextInt();
    // System.out.println(Integer.toBinaryString(b&~(1<<j)));

    // //toggle bit
    // int k=sc.nextInt();
    // System.out.println(Integer.toBinaryString(b^(1<<k)));

    //check bit
    //using Or Operator
    int q=sc.nextInt();
 
    int ans=((b|~(1<<q))>>q);
    System.out.println(ans>=1?"set bit":"off bit");    
}    
}
