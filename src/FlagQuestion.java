import java.util.*;
public class FlagQuestion {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if (n <= 0 || n >= 1000000)
         {
            System.out.println("Wrong Input");
            return;
        }
        String str=Long.toString(n);
        for(int i=0;i<str.length();i++)
        {
            int num=Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.print(9-num);
        }

    }
    
}
