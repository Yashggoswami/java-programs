import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] alice=new int[n];
            int[] bob=new int[n];

            for(int i=0;i<n;i++)
            {
                alice[i]=sc.nextInt();
            }
            
            
            for(int i=0;i<n;i++)
            {
                bob[i]=sc.nextInt();
            }
            
            int max_a=alice[0];
            int max_b=bob[0];

            for(int i=1;i<n;i++)
            {
                max_a=Math.max(max_a,alice[i]);
                max_b=Math.max(max_b,bob[i]);

                alice[i]+=alice[i-1];
                bob[i]+=bob[i-1];
            }

            max_a=alice[n-1]-max_a;
            max_b=bob[n-1]-max_b;

            if(max_a>max_b)
                System.out.println("Bob");
            else if(max_a<max_b)
                System.out.println("Alice");
            else
                System.out.println("Draw");
        }
        

    }
}


// 1
// 5
// 3 1 3 3 4
// 1 6 2 5 3