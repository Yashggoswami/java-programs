import java.util.*;
public class Inspection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int inspectors=sc.nextInt();

        char[] items=new char[n];

        for(int i=0;i<n;i++)
        {
            items[i]=sc.next().charAt(0);
        }
        
        for(int inspect=0;inspect<inspectors;inspect++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();

            int i=Math.min(a,b);
            int j=Math.max(a,b);

        
            while(i>=0 && i<=j && j<n)
            {
                if(items[i]=='P')
                    k--;
                i++;
            }
          
            
            if(k<=0)
                System.out.println("APPROVED");
            else
                System.out.println("REJECTED");
        }
        
    }
}


// 5 3
// P D D P P
// 4 1 2
// 1 5 4
// 2 5 3
